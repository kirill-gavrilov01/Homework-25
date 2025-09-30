package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/articles")
public class ArticlesController {
    private final ArticlesService articlesService;

    @Autowired
    public ArticlesController(ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articlesService.findAllArticles();
    }

    @PostMapping
    public void createArticle(@RequestBody Article article) {
        articlesService.addArticle(article);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArticleById(@PathVariable("id") UUID id) {
        Optional<Article> articleOptional = articlesService.findById(id);
        if (articleOptional.isPresent()) {
            return ResponseEntity.ok(articleOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}