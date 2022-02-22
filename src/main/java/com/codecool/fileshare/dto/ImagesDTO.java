package com.codecool.fileshare.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImagesDTO {
    int image_id;
    String title;
    String content; //url
    String category; //category-name
    String artist; //artist-name

}