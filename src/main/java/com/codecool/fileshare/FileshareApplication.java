package com.codecool.fileshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@RestController
public class FileshareApplication {

    public static void main(String[] args) {
        new input.Menu().mainMenu();
//        SpringApplication.run(FileshareApplication.class, args);
    }

//    @GetMapping
//    public List<String> hello() {
//        return List.of(
//                "hello", "world"
//        );
//    }
}
