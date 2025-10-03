package org.skypro.skyshop.service;

import org.skypro.skyshop.product.Product;

import java.util.UUID;

public abstract class ConcreteProductA extends Product {
    public ConcreteProductA(UUID uuid, String phoneA, double v) {
        super();
    }

    public abstract boolean matches(String pattern);
}
