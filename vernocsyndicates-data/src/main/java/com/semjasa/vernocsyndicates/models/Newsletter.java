package com.semjasa.vernocsyndicates.models;

import java.time.LocalDate;
import java.util.Set;

public class Newsletter extends BaseEntity {
    public Set<Article> articles;
    public String headline;
    public LocalDate creationDate;
}
