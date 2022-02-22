package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.Favourites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouritesRepository extends JpaRepository<Favourites, Integer> {

}