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

    @Query(value = "SELECT i FROM Images i", nativeQuery = true)
    List<Images> getAllImages();

//    @Query("SELECT i FROM public.images i " +
//            "JOIN public.favourites f " +
//            "ON i.image_id = f.image_id " +
//            "JOIN public.users u " +
//            "ON f.user_id = u.user_id " +
//            "WHERE u.user_name LIKE 'gsg';")
//    List<Images> getAllImages();
}
