package com.codecool.fileshare.dto.tables;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table
public class Favourites {
    @Id
    @Column(
            updatable = false
    )
    private int favId;
    private int userId;
    private int imageId;

    public Favourites(int userId, int imageId) {
        this.userId = userId;
        this.imageId = imageId;
    }
}
