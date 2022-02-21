package com.codecool.fileshare.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository {
    public String storeImage(String category, String content);
    public String readImage(String uuid);

    void findById(String id);
}
