package com.semjasa.vernocsyndicates.services;

import com.semjasa.vernocsyndicates.models.Post;

import java.util.Set;

public interface PostService {

    Post findById(Long id);

    Post findByString(String searchString);

    Post save(Post post);

    Set<Post> findAll();
}
