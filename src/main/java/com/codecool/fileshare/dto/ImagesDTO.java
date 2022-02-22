package com.codecool.fileshare.dto;

import lombok.*;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ImagesDTO {
    int image_id;
    String title;
    String content; //url
    String category; //category-name
    String artist; //artist-name

    public ImagesDTO(int image_id, String title, String content, String category, String artist) {
        this.image_id = image_id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.artist = artist;
    }
}