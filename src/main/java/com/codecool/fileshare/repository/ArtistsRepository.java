package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistsRepository extends JpaRepository<Artists, Integer> {

}