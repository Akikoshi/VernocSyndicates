package com.semjasa.vernocsyndicates.models;

import java.util.Set;

public class Auctionhouse {
    private Set<AuctionhouseEntry> entries;

    public Set<AuctionhouseEntry> getEntries() {
        return entries;
    }

    public void setEntries(Set<AuctionhouseEntry> entries) {
        this.entries = entries;
    }
}
