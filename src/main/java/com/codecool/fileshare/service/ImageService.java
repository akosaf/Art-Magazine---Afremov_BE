package com.codecool.fileshare.service;

import com.codecool.fileshare.dto.ImagesDTO;
import com.codecool.fileshare.dto.tables.Images;
import com.codecool.fileshare.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public List<Images> getImagesByUser(String user) {
        System.out.println("executing query...");
        return imageRepository.getAllImages();
    }

    public void likeImage(ImagesDTO imagesDTO, String user) {}
}
