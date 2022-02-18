package com.codecool.fileshare.dto.tables;

import javax.persistence.*;

@Entity
@Table
public class Categories {
    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence"
    )
    private int category_id;
    private String category_name;
}
