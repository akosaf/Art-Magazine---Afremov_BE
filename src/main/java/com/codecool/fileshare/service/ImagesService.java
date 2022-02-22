package com.codecool.fileshare.service;

import com.codecool.fileshare.dto.tables.Images;
import com.codecool.fileshare.repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagesService {
    private final ImagesRepository imagesRepository;

    @Autowired
    public ImagesService(ImagesRepository imagesRepository) {
        this.imagesRepository = imagesRepository;
    }

    public List<Images> getImages() {
        return imagesRepository.findAll();
    }

    public Optional<Images> getImages(Integer index) {
        return imagesRepository.findById(index);
    }
}
