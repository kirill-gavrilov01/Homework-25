
package org.skypro.skyshop.controller;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.service.Article;
import org.skypro.skyshop.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.Collection;

@RestController
@RequestMapping("/shop")
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

    /**
     * Поиск продуктов по запросу.
     *
     * @param query строка поиска
     * @return коллекция найденных продуктов
     */
    @GetMapping("/search/products")
    public Collection<Product> searchProducts(@RequestParam(value="q") String query) {
        return storageService.findProductsByQuery(query);
    }

    /**
     * Поиск статей по запросу.
     *
     * @param query строка поиска
     * @return коллекция найденных статей
     */
    @GetMapping("/search/articles")
    public Collection<Article> searchArticles(@RequestParam(value="q") String query) {
        return storageService.findArticlesByQuery(query);
    }
}
