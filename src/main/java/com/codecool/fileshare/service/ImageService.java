package com.codecool.fileshare.service;

import com.codecool.fileshare.dto.ImagesDTO;
import com.codecool.fileshare.dto.tables.Images;
import com.codecool.fileshare.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public List<ImagesDTO> getImagesByUser(String user) {
        List<List<String>> list = imageRepository.getImagesByUser(user);
        List<ImagesDTO> dtoList = new ArrayList<>();
        for (List<String> strings : list) {
            dtoList.add(new ImagesDTO(Integer.parseInt(strings.get(0)), strings.get(1), strings.get(2), strings.get(3), strings.get(4)));
        }
        return dtoList;
    }

    public void likeImage(ImagesDTO imagesDTO, String user) {
        Integer userId = imageRepository.getUserIdByName(user);
        if (userId == null) {
            try {
                imageRepository.insertUser(user);
            } catch (Exception e) {
            }
            userId = imageRepository.getUserIdByName(user);
        }
        Integer categoryId = imageRepository.getCategoryIdByName(imagesDTO.getCategory());
        if (categoryId == null) {
            try {
                imageRepository.insertCategory(imagesDTO.getCategory());
            } catch (Exception e) {
            }
            categoryId = imageRepository.getCategoryIdByName(imagesDTO.getCategory());
        }
        Integer artistId = imageRepository.getArtistIdByName(imagesDTO.getArtist());
        if (artistId == null) {
            try {
                imageRepository.insertArtist(imagesDTO.getArtist());
            } catch (Exception e) {
            }
            artistId = imageRepository.getArtistIdByName(imagesDTO.getArtist());
        }
        Images image = imageRepository.getImageByTitle(imagesDTO.getTitle());
        try {
            if (image == null)
                imageRepository.insertImage(imagesDTO.getImage_id(), imagesDTO.getTitle(), imagesDTO.getContent(), categoryId, artistId);
        } catch (Exception e) {
        }

        try {
            imageRepository.likeImage(imagesDTO.getImage_id(), userId);
        } catch (Exception e) {
        }

    }

}
