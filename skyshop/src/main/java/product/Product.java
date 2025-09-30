package product;

import java.util.UUID;

public abstract class Product implements Searchable {
    protected final UUID id = UUID.randomUUID();
    protected String productName;
    protected double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product() {

    }

    // Реализация методов интерфейса Searchable
    @Override
    public String getSearchTerm() { return productName; }
    @Override
    public String getContentType() { return "product"; }
    @Override
    public String getName() { return productName; }

    // Метод getId()
    public UUID getId() { return id; }
}