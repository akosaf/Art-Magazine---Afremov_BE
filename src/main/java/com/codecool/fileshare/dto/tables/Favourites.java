package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Favourites {
    @Id
    private int favId;
    private int userId;
    private int imageId;
}
