package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository {
    public String storeImage(String category, String content);
    public String readImage(String uuid);

    void findById(String id);

//    @Query("SELECT i FROM public.Images i")
//    List<Images> getAllImages();

    @Query("SELECT i FROM public.images i\n" +
            "JOIN public.favourites f\n" +
            "ON i.image_id = f.image_id\n" +
            "JOIN public.users u\n" +
            "ON f.user_id = u.user_id\n" +
            "WHERE u.user_name ILIKE 'gsg';")
    List<Images> getAllImages();
}
