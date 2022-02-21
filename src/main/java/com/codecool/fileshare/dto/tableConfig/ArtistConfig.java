package com.codecool.fileshare.dto.tableConfig;

import com.codecool.fileshare.dto.tables.Artists;
import com.codecool.fileshare.repository.ArtistsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.awt.*;

@Configuration
public class ArtistConfig {

    @Bean
    CommandLineRunner commandLineRunner(ArtistsRepository repository) {
        return args -> {
            Artists zabiela = new Artists(12, "James Zabiela");
            Artists arthur = new Artists(13, "James Arthur");
            Artists bond = new Artists(14, "James Bond");
            repository.saveAll(List.of(zabiela, arthur, bond));
        };
    }
}
