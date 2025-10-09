package org.skypro.skyshop.service;

import org.skypro.skyshop.product.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    private final Map<Long, Product> products = new HashMap<>();

    public ProductService() {
        initTestData();
    }

    private void initTestData() {
        products.put(1L, new Product("Product A"));
        products.put(2L, new Product("Product B"));
        products.put(3L, new Product("Product C"));
    }

    @GetMapping
    public List<Product> listProducts() {
        return new ArrayList<>(products.values());
    }
}


