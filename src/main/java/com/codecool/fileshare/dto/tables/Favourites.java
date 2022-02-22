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
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(
            updatable = false
    )
    private int favId;
    private int userId;
    private int imageId;
}
