package service;

import product.Searchable;

import java.util.ArrayList;
import java.util.Collection;
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
        // Фильтрация по соответствию паттерну
        // Преобразование с помощью лямбды
        List<Object> list = new ArrayList<>();
        for (Searchable item : allItems) {
            if (item.matches(pattern)) {
                Object fromSearchable = SearchResult.fromSearchable(item);
                list.add(fromSearchable);
            }
        }
        return list.reversed();
    }
}