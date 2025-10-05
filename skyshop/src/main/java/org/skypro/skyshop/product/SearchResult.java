package org.skypro.skyshop.product;

import org.skypro.skyshop.controller.Article;

import java.util.UUID;

public class SearchResult {
    private final UUID id;
    private final String name;
    private final String contentType;

    // Единственно верный конструктор с минимумом аргументов
    public SearchResult(String name, String contentType) {
        this.id = UUID.randomUUID(); // Генерируем уникальный ID автоматически
        this.name = name;
        this.contentType = contentType;
    }

    // Фабричный метод для преобразования из Searchable
    public static SearchResult fromSearchable(Searchable searchable) {
        if (searchable instanceof Product) {
            Product product = (Product) searchable;
            return new SearchResult(product.getName(), "org/skypro/skyshop/product");
        } else if (searchable instanceof Article) {
            Article article = (Article) searchable;
            return new SearchResult(article.getTitle(), "article");
        } else {
            throw new IllegalArgumentException("Unsupported type of Searchable object.");
        }
    }

    // Геттеры
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContentType() {
        return contentType;
    }
}
