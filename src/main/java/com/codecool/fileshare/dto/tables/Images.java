package com.codecool.fileshare.dto.tables;

import javax.persistence.*;

@Entity
@Table
public class Images {
    @Id
    @SequenceGenerator(
            name = "image_sequence",
            sequenceName = "image_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_sequence"
    )
    private int image_id;
    private String content;
    private int category_id;
    private int artist_id;
}