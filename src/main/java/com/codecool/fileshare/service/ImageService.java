package com.codecool.fileshare.service;

import com.codecool.fileshare.dto.ImageDTO;
import com.codecool.fileshare.dto.tables.Artists;
import com.codecool.fileshare.repository.ImageJdbcRepository;
import com.codecool.fileshare.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    @Qualifier("jdbc")
    ImageRepository imageRepository;

    public String storeImage(ImageDTO imageDTO, String category){
        return imageRepository.storeImage(category, imageDTO.getContent());
    }

    public ImageDTO getImage(String fileName){
        return  new ImageDTO(imageRepository.readImage(fileName));
    }

    public void deleteImage(String id) {
        imageRepository.findById(id);
    }

    public List<String> getImages() {
        return List.of(
                "hello", "world"
        );
    }
}
