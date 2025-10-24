package org.skypro.skyshop.model.a.search;


import java.util.UUID;



public interface Searchable {

    String getSearchTerm();

    String getContentType();

    String getName();

    default String getStringRepresentation() {
        return getName() + " - " + getContentType();
    }

    UUID getId();
}
