package com.codecool.fileshare.controller;

import com.codecool.fileshare.dto.ImagesDTO;
import com.codecool.fileshare.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/images")
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping(params = "user")
    public List<ImagesDTO> getImagesByUser(@RequestParam String user){
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