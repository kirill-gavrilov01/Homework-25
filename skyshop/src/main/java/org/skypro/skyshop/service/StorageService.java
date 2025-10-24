package org.skypro.skyshop.service;

import org.skypro.skyshop.model.a.article.Article;
import org.skypro.skyshop.model.a.product.Product;
import org.skypro.skyshop.model.a.product.special.DiscountedProducts;
import org.skypro.skyshop.model.a.product.special.FixPriceProduct;
import org.skypro.skyshop.model.a.product.special.SimpleProduct;
import org.skypro.skyshop.model.a.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class StorageService {
    private final Map<UUID, Product> products = new HashMap<>();
    private final Map<UUID, Article> articles = new HashMap<>();

    public StorageService() {
        initializeData();
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public Collection<Article> getAllArticles() {
        return articles.values();
    }

    public Collection<Searchable> getAllSearchables() {
        return Stream.concat(products.values().stream(), articles.values().stream())
                .collect(Collectors.toList());
    }

    private void initializeData() {
        UUID uuid1 = UUID.randomUUID();
        products.put(uuid1, new SimpleProduct(uuid1, "Дырокол", 500));
        UUID uuid2 = UUID.randomUUID();
        products.put(uuid2, new DiscountedProducts(uuid2, "Степлер", 700, 30));
        UUID uuid3 = UUID.randomUUID();
        products.put(uuid3, new FixPriceProduct(uuid3, "Ручка шариковая, синяя"));
        UUID artUuid1 = UUID.randomUUID();
        articles.put(artUuid1, new Article(artUuid1, "Про степлер", "Разнообразие, виды, назначение"));
        UUID artUuid2 = UUID.randomUUID();
        articles.put(artUuid2, new Article(artUuid2, "История степлера", "В изобретении степлера Ученые нашли " +
                "внеземной след!"));
    }
}