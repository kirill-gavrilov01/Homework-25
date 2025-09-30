package product;

// Фиксированная цена FixPriceProduct.java
public abstract class FixPriceProduct extends Product {
    public FixPriceProduct(String productName, double fixedPrice) {
        super(productName, fixedPrice);
    }
}
