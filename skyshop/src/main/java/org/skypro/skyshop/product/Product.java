package org.skypro.skyshop.product;

import java.util.UUID;

public  class Product implements Searchable {
    protected final UUID id = UUID.randomUUID();
    protected String productName;
    protected double price;

    public Product(long l, String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product() {

    }

    public Product(String productA) {
    }

    // Реализация методов интерфейса Searchable
    @Override
    public String getSearchTerm() { return productName; }
    @Override
    public String getContentType() { return "org/skypro/skyshop/product"; }
    @Override
    public String getName() { return productName; }

    @Override
    public boolean matches(String pattern) {
        return false;
    }

    // Метод getId()
    public UUID getId() { return id; }
}