package com.semjasa.vernocsyndicates.services.Maps;

import com.semjasa.vernocsyndicates.models.Article;
import com.semjasa.vernocsyndicates.services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ArticleServiceMap extends AbstractMapService<Article, Long> implements ArticleService {
    @Override
    public Set<Article> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Article object) {
        super.delete(object);
    }

    @Override
    public Article save(Article object) {
        return super.save(object);
    }

    @Override
    public Article findById(Long id) {
        return super.findById(id);
    }
}
