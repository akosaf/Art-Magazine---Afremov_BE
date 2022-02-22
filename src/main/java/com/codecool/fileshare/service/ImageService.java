package com.codecool.fileshare.service;

import com.codecool.fileshare.dto.ImageDTO;
import com.codecool.fileshare.dto.ImagesDTO;
import com.codecool.fileshare.dto.tables.Images;
import com.codecool.fileshare.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public List<ImagesDTO> getImagesByUser(String user) {
        System.out.println("executing query...");
        List<List<String>> list = imageRepository.getAllImages(user);
//        list.forEach(System.out::println);
        List<ImagesDTO> dtoList = new ArrayList<>();
        for (List<String> strings : list) {
            dtoList.add(new ImagesDTO(Integer.parseInt(strings.get(0)), strings.get(1), strings.get(2), strings.get(3), strings.get(4)));
        }
        return dtoList;
    }

    public void likeImage(ImagesDTO imagesDTO, String user) {}
}
