package com.codecool.fileshare.dto.tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
