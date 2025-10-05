package org.skypro.skyshop.service;
import org.skypro.skyshop.product.Searchable;
import java.util.UUID;


public  class Article implements Searchable {
    private final UUID id = UUID.randomUUID();
    private String name;
    private String contentType;

    public Article(String name, String contentType) {
        this.name = name;
        this.contentType = contentType;
    }

    public Article() {

    }

    // Реализация методов интерфейса Searchable
    @Override
    public String getSearchTerm() { return name; }
    @Override
    public String getContentType() { return contentType; }
    @Override
    public String getName() { return name; }

    @Override
    public boolean matches(String pattern) {
        return false;
    }

    // Метод getId()
    public UUID getId() { return id; }

    public String getTitle() {

        return "";
    }
}