package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Artists {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(
            updatable = false
    )
    private int artistId;
    private String artistName;
}
