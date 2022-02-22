package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Artists {
    @Id
    @Column(
            updatable = false
    )
    private int artistId;
    private String artistName;

    public Artists(String artistName) {
        this.artistName = artistName;
    }
}
