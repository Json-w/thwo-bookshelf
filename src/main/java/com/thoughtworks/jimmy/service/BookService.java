package com.thoughtworks.jimmy.service;

import com.thoughtworks.jimmy.model.Book;

public interface BookService {

    Iterable<Book> findAll();

    Book findByIsbn(String isbn);

    void create(Book book);

    void delete(String isbn);

    void edit(Book book);

    Iterable<Book> findByTitle(String title);

    Iterable<Book> findByTag(String tag);
}
