package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Users {
    @Id
    @Column(
            updatable = false
    )
    private int userId;
    private String userName;

    public Users(String userName) {
        this.userName = userName;
    }
}
