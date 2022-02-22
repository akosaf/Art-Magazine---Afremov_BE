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
    @SequenceGenerator(
            name = "fav_sequence",
            sequenceName = "fav_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fav_sequence"
    )
    @Column(
            updatable = false
    )
    private Long favId;
    private int userId;
    private int imageId;

    public Favourites(int userId, int imageId) {
        this.userId = userId;
        this.imageId = imageId;
    }
}
