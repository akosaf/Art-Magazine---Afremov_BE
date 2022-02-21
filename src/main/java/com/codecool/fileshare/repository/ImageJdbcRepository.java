package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.Images;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("jdbc")
public class ImageJdbcRepository implements ImageRepository{


    @Override
    public String storeImage(String category, String content) {
        // implement store image in database here
        // content is base64 coded image file
        // generate and return uuid of stored image
        // https://www.base64-image.de/
        // https://codebeautify.org/base64-to-image-converter
        return null;
    }

    @Override
    public String readImage(String uuid) {
        // implement readImage from database here
        // return base64 encoded image
        return "content will be here";
    }

    @Override
    public void findById(String id) {

    }

    @Override
    public List<Images> getAllImages() {
        return null;
    }
}
