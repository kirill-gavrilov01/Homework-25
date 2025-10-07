package org.skypro.skyshop.service;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface StorageService {

    Collection<Product> getAllProducts();

    Collection<Article> getAllArticles();

    List<Product> findProductsByQuery(String query); // Новый метод поиска продуктов

    List<Article> findArticlesByQuery(String query); // Новый метод поиска статей

    Collection<Searchable> getAllSearchables();
}

// Класс реализации интерфейса StorageServiceImpl.java
class StorageServiceImpl implements StorageService {

    // Предположим, у вас есть хранилище данных
    private Collection<Product> products;
    private Collection<Article> articles;

    @Override
    public Collection<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Collection<Article> getAllArticles() {
        return List.of();
    }

    // Примеры реализации методов поиска
    @Override
    public List<Product> findProductsByQuery(String query) {
        return products.stream()
                .filter(product -> product.getName().contains(query))
                .collect(Collectors.toList());
    }

    @Override
    public List<Article> findArticlesByQuery(String query) {
        return articles.stream()
                .filter(article -> article.getTitle().contains(query))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Searchable> getAllSearchables() {
        return List.of();
    }

    // Другие методы...
}
