package org.skypro.skyshop.service;

import org.skypro.skyshop.controller.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class ArticlesService {
    List<Article> articles = new ArrayList<>();
    private Article article;

    public void addArticle() {
        articles.add(article);
    }

    public List<Article> findAllArticles() {
        return articles;
    }

    public Optional<Article> findById(UUID id) {
        return articles.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    public void addArticle(Article article) {

    }
}