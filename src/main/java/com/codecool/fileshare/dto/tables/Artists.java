package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Artists {
    @Id
    private int artistId;
    private String artistName;
}
