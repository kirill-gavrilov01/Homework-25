package product;


// Интерфейс Searchable.java
public interface Searchable {
    String getSearchTerm();
    String getContentType();
    String getName();

    boolean matches(String pattern);
}