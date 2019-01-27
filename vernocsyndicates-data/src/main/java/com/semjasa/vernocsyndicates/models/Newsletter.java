package com.semjasa.vernocsyndicates.models;

import java.util.Date;

public class Newsletter extends BaseEntity {
    public Set<Article> articles;
    public String headline;
    public Date creationDate;
}
