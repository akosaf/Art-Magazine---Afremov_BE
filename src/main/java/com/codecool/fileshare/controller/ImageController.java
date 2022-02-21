package com.codecool.fileshare.controller;

import com.codecool.fileshare.dto.ImageDTO;
import com.codecool.fileshare.dto.ImagesDTO;
import com.codecool.fileshare.dto.tables.Images;
import com.codecool.fileshare.service.ImageService;
import com.codecool.fileshare.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/images")
public class ImageController {

    @Autowired
    ImageService imageService;
/*
    @PostMapping("/{category}")
    public String storeImage(@RequestBody ImageDTO imageDTO, @PathVariable("category") String category){
        return imageService.storeImage(imageDTO,category);
    }

    @GetMapping("/{uuid}")
    public ImageDTO getImage(@PathVariable("uuid") String uuid){
        return imageService.getImage(uuid);
    }
*/
    @GetMapping("/{user}")
    public List<Images> getImagesByUser(@PathVariable("user") String user){
        return imageService.getImagesByUser(user);
    }

    @PostMapping("/{user}")
    public void likeImage(@RequestBody ImagesDTO imagesDTO, @PathVariable("user") String user){
        imageService.likeImage(imagesDTO,user);
    }


    @GetMapping
    public List<String> hello() {
        return List.of("hello", "world");
    }

}