package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Categories {
    @Id
    @Column(
            updatable = false
    )
    private int categoryId;
    private String categoryName;

    public Categories(String categoryName) {
        this.categoryName = categoryName;
    }
}
