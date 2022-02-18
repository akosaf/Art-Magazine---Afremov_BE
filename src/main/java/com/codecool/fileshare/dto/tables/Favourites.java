package com.codecool.fileshare.dto.tables;

import javax.persistence.*;

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
    private int fav_id;
    private int user_id;
    private int image_id;
}
