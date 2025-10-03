package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public abstract class ConcreteProductA extends Product {
    public ConcreteProductA(String name, double price) {
        super(name, price);
    }
}
