package com.codecool.fileshare.controller;

import com.codecool.fileshare.dto.tables.Images;
import com.codecool.fileshare.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/console")
public class ConsoleController {

    @Autowired
    ImagesService imagesService;

    @GetMapping()
    public List<Images> getImage() {
        return imagesService.getImages();
    }

    @GetMapping("/{uuid}")
    public Optional<Images> getImage(@PathVariable("uuid") Integer uuid) {
        return imagesService.getImages(uuid);
    }
}