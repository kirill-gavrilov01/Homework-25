package service;

import product.Product;
import product.Searchable;

import java.util.*;

@service.Service
public class StorageService {

    private final Map<UUID, Product> products = new HashMap<>();
    private final Map<UUID, Article> articles = new HashMap<>();

    /**
     * Конструктор создает начальные объекты и добавляет их в хранилища.
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
    public Collection<Article> getAllArticles() {
        return Collections.unmodifiableCollection(articles.values());
    }

    /**
     * Приватный метод для заполнения хранилищ тестовыми объектами.
     */
    private void initializeData() {
        // Тестовые продукты
        products.put(
                UUID.randomUUID(),
                new ConcreteProductA(UUID.randomUUID(), "Phone A", 500.0) {
                    @Override
                    public UUID getId() {
                        return null;
                    }

                    @Override
                    public boolean matches(String pattern) {
                        return false;
                    }
                });

        products.put(
                UUID.randomUUID(),
                new ConcreteProductB(UUID.randomUUID(), "Laptop B", 800.0) {
                    @Override
                    public UUID getId() {
                        return null;
                    }

                    @Override
                    public boolean matches(String pattern) {
                        return false;
                    }
                });

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
