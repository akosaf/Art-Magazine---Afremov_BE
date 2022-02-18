package com.codecool.fileshare.dto.tables;

import javax.persistence.*;

@Entity
@Table
public class Artists {
    @Id
    @SequenceGenerator(
            name = "artist_sequence",
            sequenceName = "artist_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "artist_sequence"
    )
    private int artist_id;
    private String artist_name;
}
