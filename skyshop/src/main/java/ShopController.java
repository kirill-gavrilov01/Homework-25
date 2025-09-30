import product.Product;
import service.Article;
import service.StorageService;

import java.util.Collection;

public class ShopController {

    private final StorageService storageService;

    public ShopController(StorageService storageService) {
        this.storageService = storageService;
    }

    /**
     * Получение всех продуктов.
     */
    public Collection<Product> getAllProducts() {
        return storageService.getAllProducts();
    }

    /**
     * Получение всех статей.
     */
    public Collection<Article> getAllArticles() {
        return storageService.getAllArticles();
    }
}
