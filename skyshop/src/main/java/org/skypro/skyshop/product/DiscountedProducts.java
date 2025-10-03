package org.skypro.skyshop.product;

// Продукт со скидкой DiscountedProducts.java
public class DiscountedProducts extends Product {
    private double discountPercentage;

    public DiscountedProducts(String productName, double price, double discountPercentage) {
        super(productName, price);
        this.discountPercentage = discountPercentage;
    }

    // Переопределение метода getPrice() для учета скидки
    public double getFinalPrice() {
        return price * (1 - discountPercentage / 100);
    }
}
