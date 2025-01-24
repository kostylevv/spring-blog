package com.vkostylev.yp.mjd.springblog.repository;

import com.vkostylev.yp.mjd.springblog.model.Post;

import java.util.List;

public interface PostRepository {
    List<Post> findAll();
    Post findOne(Long id);
    void save(Post post);
}
