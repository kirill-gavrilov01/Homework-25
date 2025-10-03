package org.skypro.skyshop.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class ArticlesService {
    List<Article> articles = new ArrayList<>();

    public void addArticle(Article article) {
        articles.add(article);
    }

    public List<Article> findAllArticles() {
        return articles;
    }

    public Optional<Article> findById(UUID id) {
        return articles.stream().filter(a -> a.getId().equals(id)).findFirst();
    }
}