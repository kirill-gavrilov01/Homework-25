package org.skypro.skyshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.skypro.skyshop.product.Searchable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class SearchService {
    private final StorageService storageService;

    @Autowired
    public SearchService(StorageService storageService) {
        this.storageService = storageService;
    }

    /**
     * Поиск среди всех сущностей по заданному шаблону.
     *
     * @param pattern Шаблон для поиска
     * @return Коллекция результатов поиска
     */
    public List<Object> search(String pattern) {
        Collection<Searchable> allItems = storageService.getAllSearchables();

        // Создаем пустой список для хранения найденных объектов
        List<Object> results = new ArrayList<>();

        // Перебираем элементы коллекции и фильтруем подходящие объекты
        for (Searchable item : allItems) {
            if (item.matches(pattern)) {  // Проверяем совпадение с шаблоном
                Object fromSearchable = SearchResult.fromSearchable(item);
                results.add(fromSearchable);  // Добавляем объект в список
            }
        }

        // Оборачиваем исходный список новым списком и обращаем порядок элементов
        Collections.reverse(results);

        return results;
    }
}
