package org.skypro.skyshop.service.impl;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.service.Article;
import org.springframework.stereotype.Service;
import org.skypro.skyshop.service.StorageService;
import org.skypro.skyshop.product.Searchable;

import java.util.Collection;
import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Override
    public Collection<Searchable> getAllSearchables() {
        // Логику возврата списка сущностей (продуктов, статей и др.) реализовать тут
        throw new UnsupportedOperationException("Метод пока не реализован");
    }

    @Override
    public Collection<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Collection<Article> findArticlesByQuery(String query) {
        return List.of();
    }

    @Override
    public Collection<Product> findProductsByQuery(String query) {
        return List.of();
    }

    @Override
    public Collection<Article> getAllArticles() {
        return List.of();
    }
}
