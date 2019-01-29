package com.semjasa.vernocsyndicates.services.Maps;

import com.semjasa.vernocsyndicates.models.Newsletter;
import com.semjasa.vernocsyndicates.services.NewsletterService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class NewsletterServiceMap extends AbstractMapService<Newsletter, Long> implements NewsletterService {
    @Override
    public Set<Newsletter> findAll() {
        return super.findAll();
    }

    @Override
    public Newsletter findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Newsletter save(Newsletter object) {
        return super.save(object);
    }

    @Override
    public void delete(Newsletter object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
