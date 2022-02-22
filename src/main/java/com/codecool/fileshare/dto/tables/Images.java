package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Images")
@Table(name = "Images")
public class Images {
    @Id
    private int imageId;
    private String title;
    private String content;
    private int categoryId;
    private int artistId;
}
