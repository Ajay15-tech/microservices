package com.o;

import java.util.List;

public interface DatabasePersistence {
    void save(Book book);
    List<Book> getAllBooks();
}