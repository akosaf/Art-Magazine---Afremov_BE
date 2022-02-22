package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.Artists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Artists, Integer> {

}