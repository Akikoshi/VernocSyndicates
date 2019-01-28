package com.semjasa.vernocsyndicates.services.Maps;

import com.semjasa.vernocsyndicates.models.Rank;
import com.semjasa.vernocsyndicates.services.RankService;

import java.util.Set;

public class RankServiceMap extends AbstractMapService<Rank, Long> implements RankService {
    @Override
    public Set<Rank> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Rank object) {
        super.delete(object);
    }

    @Override
    public Rank save(Rank object) {
        return super.save(object);
    }

    @Override
    public Rank findById(Long id) {
        return super.findById(id);
    }
}
