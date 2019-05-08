package com.codeup.blog.repositories;

import com.codeup.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository implements CrudRepository<Post, Long> {


    @Override
    public <S extends Post> S save(S s) {
        return null;
    }

    @Override
    public <S extends Post> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Post findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Post> findAll() {
        return null;
    }

    @Override
    public Iterable<Post> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void delete(Iterable<? extends Post> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
