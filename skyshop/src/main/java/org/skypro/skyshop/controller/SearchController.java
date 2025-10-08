package org.skypro.skyshop.controller;

import org.skypro.skyshop.service.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.skypro.skyshop.service.SearchService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    /**
     * Получает результаты поиска по указанному паттерну.
     *
     * @param pattern Строка поиска
     * @return Список объектов SearchResult
     */
    @GetMapping(value = "/search")
    public List<Object> findAllMatchingResults(@RequestParam String pattern) {
        return searchService.search(pattern);
    }
}
