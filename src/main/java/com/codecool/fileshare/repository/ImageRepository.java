package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.ImagesDTO;
import com.codecool.fileshare.dto.tables.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Images, Integer> {

//    @Query("SELECT i FROM Images i")
//    List<Images> getAllImages();

//    List<Images> findByCategoryId(int categoryId);

//    @Query(value = "SELECT i FROM Images i " +
//            "JOIN Favourites f " +
//            "ON i.image_id = f.image_id ", nativeQuery = true)
    @Query(value = "SELECT i.image_id, i.title, i.content, c.category_name, a.artist_name FROM Images i " +
            "JOIN Favourites f " +
            "ON i.image_id = f.image_id " +
            "JOIN Users u " +
            "ON f.user_id = u.user_id " +
            "JOIN Artists a " +
            "ON a.artist_id = i.artist_id " +
            "JOIN Categories c " +
            "ON c.category_id = i.category_id ", nativeQuery = true)
    List<List<String>> getAllImages();
}
