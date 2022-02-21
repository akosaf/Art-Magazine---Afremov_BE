package com.codecool.fileshare.dto.tables;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Users {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private int user_id;
    private String user_name;
    private String password;
}
