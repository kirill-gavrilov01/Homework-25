package org.skypro.skyshop.service;

import org.skypro.skyshop.exceptions.InvalidSearchPatternException;
import org.skypro.skyshop.model.a.search.SearchResult;
import org.skypro.skyshop.model.a.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {
    private final StorageService storageService;

    public SearchService(StorageService storageService) {
        this.storageService = storageService;
    }

    public List<SearchResult> search(String pattern) {
        if (pattern == null || pattern.isBlank()) {
            throw new InvalidSearchPatternException("Поисковый запрос не может быть пустым или состоять из пробелов!");
        }

        Collection<Searchable> allSearchables = storageService.getAllSearchables();
        return allSearchables.stream()
                .filter(searchable -> searchable.getSearchTerm().toLowerCase().contains(pattern.toLowerCase()))
                .map(SearchResult::fromSearchable)
                .collect(Collectors.toList());
    }
}