package com.thoughtworks.jimmy.repository;

import org.springframework.data.repository.CrudRepository;
import com.thoughtworks.jimmy.model.Book;

public interface BookRepository extends CrudRepository<Book, String>{
    Iterable<Book> findByTitle(String title);
}
