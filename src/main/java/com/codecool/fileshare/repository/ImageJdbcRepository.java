package com.codecool.fileshare.repository;

import com.codecool.fileshare.dto.tables.Images;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


//@Component("jdbc")
public class ImageJdbcRepository {//implements ImageRepository{
/*

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

    @Override
    public List<Images> findAll() {
        return null;
    }

    @Override
    public List<Images> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Images> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Images> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Images entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Images> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Images> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Images> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Images> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Images> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Images> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Images> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Images getOne(Integer integer) {
        return null;
    }

    @Override
    public Images getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Images> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Images> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Images> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Images> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Images> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Images> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Images, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }*/
}
