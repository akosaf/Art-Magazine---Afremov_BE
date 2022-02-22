package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Categories {
    @Id
    private int categoryId;
    private String categoryName;
}
