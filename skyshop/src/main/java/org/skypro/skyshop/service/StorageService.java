package org.skypro.skyshop.service;

import org.skypro.skyshop.controller.Article;
import org.springframework.stereotype.Service;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

import java.util.*;

@Service
public class StorageService {

    private final Map<UUID, Product> products = new HashMap<>();
    private final Map<UUID, org.skypro.skyshop.service.Article> articles = new HashMap<>();

    /**
     * Конструктор создаёт начальные объекты и добавляет их в хранилища.
     */
    public StorageService() {
        initializeData(); // Метод инициализации данных
    }

    /**
     * Возвращает коллекцию всех продуктов.
     *
     * @return коллекция всех продуктов
     */
    public Collection<Product> getAllProducts() {
        return Collections.unmodifiableCollection(products.values());
    }

    /**
     * Возвращает коллекцию всех статей.
     *
     * @return коллекция всех статей
     */
    public Collection<org.skypro.skyshop.service.Article> getAllArticles() {
        return Collections.unmodifiableCollection(articles.values());
    }

    /**
     * Приватный метод для заполнения хранилищ тестовыми объектами.
     */
    private void initializeData() {
        // Тестовые продукты
        products.put(
                UUID.randomUUID(),
                new ConcreteProductA(UUID.randomUUID(), "Phone A", 500.0));

        products.put(
                UUID.randomUUID(),
                new org.skypro.skyshop.service.ConcreteProductB(UUID.randomUUID(), "Laptop B", 800.0));

        // Тестовые статьи
        articles.put(
                UUID.randomUUID(),
                new Article(UUID.randomUUID(), 1L, "Test Article Title", new Date()));

        articles.put(
                UUID.randomUUID(),
                new Article(UUID.randomUUID(), 2L, "Another Test Article", new Date()));
    }

    public Collection<Searchable> getAllSearchables() {
        return List.of();
    }
}
