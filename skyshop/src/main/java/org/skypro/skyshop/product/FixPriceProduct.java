package org.skypro.skyshop.product;

// Фиксированная цена FixPriceProduct.java
public class FixPriceProduct extends Product {
    public FixPriceProduct(String productName, double fixedPrice) {
        super(productName, fixedPrice);
    }
}
