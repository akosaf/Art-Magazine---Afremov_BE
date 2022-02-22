package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Images, Integer> {

    @Query(value = "SELECT i.image_id, i.title, i.content, c.category_name, a.artist_name FROM Images i " +
            "JOIN Favourites f " +
            "ON i.image_id = f.image_id " +
            "JOIN Users u " +
            "ON f.user_id = u.user_id " +
            "JOIN Artists a " +
            "ON a.artist_id = i.artist_id " +
            "JOIN Categories c " +
            "ON c.category_id = i.category_id " +
            "WHERE u.user_name = :user", nativeQuery = true)
    List<List<String>> getImagesByUser(@Param("user") String user);

    @Query(value = "SELECT a.artist_id FROM Artists a " +
            "WHERE a.artist_name = :artist", nativeQuery = true)
    Integer getArtistIdByName(@Param("artist") String artist);

    @Query(value = "INSERT INTO Artists (artist_name) " +
            "VALUES(:artist)", nativeQuery = true)
    void insertArtist(@Param("artist") String artist);

    @Query(value = "SELECT c.category_id FROM Categories c " +
            "WHERE c.category_name = :category", nativeQuery = true)
    Integer getCategoryIdByName(@Param("category") String category);

    @Query(value = "INSERT INTO Categories (category_name) " +
            "VALUES(:category)", nativeQuery = true)
    void insertCategory(@Param("category") String category);

    @Query(value = "SELECT u.user_id FROM Users u " +
            "WHERE u.user_name = :user ", nativeQuery = true)
    Integer getUserIdByName(@Param("user") String user);

    @Query(value = "INSERT INTO Users (user_name) " +
            "VALUES(:user) ", nativeQuery = true)
    void insertUser(@Param("user") String user);

    Images getImageByTitle(@Param("image") String image);

    @Query(value = "INSERT INTO Images (image_id, title, content, artist_id, category_id) " +
            "VALUES(:image_id, :title, :content, :artist_id, :category_id) ", nativeQuery = true)
    void insertImage(@Param("image_id") int image_id,
                     @Param("title") String title,
                     @Param("content") String content,
                     @Param("artist_id") int artist_id,
                     @Param("category_id") int category_id);

    @Query(value = "INSERT INTO Favourites (image_id, user_id) " +
            "VALUES(:image_id, :user_id) ", nativeQuery = true)
    void likeImage(@Param("image_id") Integer image_id, @Param("user_id") Integer user_id);


}
