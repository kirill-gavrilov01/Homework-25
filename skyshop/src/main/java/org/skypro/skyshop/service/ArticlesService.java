package org.skypro.skyshop.service;


import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ArticlesService {

    private final Map<Long, Article> articles = new HashMap<>();

    public ArticlesService() {
        initializeTestData();
    }

    private void initializeTestData() {
        articles.put(1L, new Article(1L, "JavaScript for Beginners"));
        articles.put(2L, new Article(2L, "Spring Boot in Action"));
        articles.put(3L, new Article(3L, "React Native App Development"));
    }

    public List<Article> getAllArticles() {
        return new ArrayList<>(articles.values());
    }
}