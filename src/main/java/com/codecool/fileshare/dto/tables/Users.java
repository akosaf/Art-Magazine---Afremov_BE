package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(
            updatable = false
    )
    private int userId;
    private String userName;
}
