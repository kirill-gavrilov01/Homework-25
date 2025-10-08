package org.skypro.skyshop.service;

// Импортируйте нужные типы
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

import java.util.Collection;

public interface StorageService {
    Collection<Searchable> getAllSearchables(); // Метод для получения всех поисковых объектов

    Collection<Product> getAllProducts();

    Collection<Article> findArticlesByQuery(String query);

    Collection<Product> findProductsByQuery(String query);

    Collection<Article> getAllArticles();
}
