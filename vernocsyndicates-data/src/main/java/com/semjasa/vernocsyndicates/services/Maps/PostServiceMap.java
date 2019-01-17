package com.semjasa.vernocsyndicates.services.Maps;

import com.semjasa.vernocsyndicates.models.Post;
import com.semjasa.vernocsyndicates.services.PostService;

import java.util.Set;

public class PostServiceMap extends AbstractMapService<Post, Long> implements PostService<Post, Long> {

    @Override
    public Set<Post> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Post object) {
        super.delete(object);
    }

    @Override
    public Post save(Post object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Post findById(Long id) {
        return super.findById(id);
    }
}
