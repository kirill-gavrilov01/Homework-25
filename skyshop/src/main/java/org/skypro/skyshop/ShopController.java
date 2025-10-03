package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.service.Article;
import org.skypro.skyshop.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/")
public class ShopController {

    private final StorageService storageService;

    @Autowired
    public ShopController(StorageService storageService) {
        this.storageService = storageService;
    }

    /**
     * Получение всех продуктов.
     */
    @GetMapping("/products")
    public Collection<Product> getAllProducts() {
        return storageService.getAllProducts();
    }

    /**
     * Получение всех статей.
     */
    @GetMapping("/articles")
    public Collection<Article> getAllArticles() {
        return storageService.getAllArticles();
    }
}
