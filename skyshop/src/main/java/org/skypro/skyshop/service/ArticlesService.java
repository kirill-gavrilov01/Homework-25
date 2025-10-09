package org.skypro.skyshop.service;

import org.skypro.skyshop.controller.Article;
import org.skypro.skyshop.product.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


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
