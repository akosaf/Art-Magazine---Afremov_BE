package com.codecool.fileshare;

import com.codecool.fileshare.input.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileshareApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileshareApplication.class, args);
        new Menu().mainMenu();
    }

}
