package com.semjasa.vernocsyndicates.models;

import java.time.LocalDate;
import java.util.Set;

public class Newsletter extends BaseEntity {
    private Set<Article> articles;
    private String headline;
    private LocalDate creationDate;

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
