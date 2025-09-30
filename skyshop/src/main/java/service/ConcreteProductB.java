package service;

import product.Product;

import java.util.UUID;

public abstract class ConcreteProductB extends Product {
    public ConcreteProductB(UUID uuid, String laptopB, double v) {
        super();
    }

    public abstract boolean matches(String pattern);
}
