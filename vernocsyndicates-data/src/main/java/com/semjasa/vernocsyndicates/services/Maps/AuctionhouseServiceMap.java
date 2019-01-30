package com.semjasa.vernocsyndicates.services.Maps;

import com.semjasa.vernocsyndicates.models.AuctionhouseEntry;
import com.semjasa.vernocsyndicates.services.AuctionhouseService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuctionhouseServiceMap extends AbstractMapService<AuctionhouseEntry, Long> implements AuctionhouseService {
    @Override
    public Set<AuctionhouseEntry> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(AuctionhouseEntry object) {
        super.delete(object);
    }

    @Override
    public AuctionhouseEntry save(AuctionhouseEntry object) {
        return super.save(object);
    }

    @Override
    public AuctionhouseEntry findById(Long id) {
        return super.findById(id);
    }
}
