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

    private final Map<Long, Product> products = new HashMap<>(); // Хранит тестовые данные

    public ProductService() { // Конструктор
        initializeTestData(); // Вызываем метод для загрузки тестовых данных
    }

    private void initializeTestData() {
        products.put(1L, new Product(1L, "Apple iPhone 14", 1000)); // Тестовый продукт №1
        products.put(2L, new Product(2L, "Samsung Galaxy S23", 800)); // Тестовый продукт №2
        products.put(3L, new Product(3L, "Google Pixel 7", 700)); // Тестовый продукт №3
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values()); // Возвращаем список всех продуктов
    }
}


