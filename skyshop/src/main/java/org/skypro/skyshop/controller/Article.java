package org.skypro.skyshop.controller;

import java.util.Date;
import java.util.UUID;

public class Article extends org.skypro.skyshop.service.Article {
    public Article(UUID uuid, long l, String testArticleTitle, Date date) {
        super();

    }

    public Article(String name, String contentType) {
        super(name, contentType);
    }

    public String getTitle() {

        return "";
    }

    public UUID getId() {

        return null;
    }
}
