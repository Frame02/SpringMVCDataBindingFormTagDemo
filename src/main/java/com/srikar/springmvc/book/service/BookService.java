package com.srikar.springmvc.book.service;

import com.srikar.springmvc.book.domain.Book;

import java.util.List;

/**
 * Created by vedantas on 2/4/2018.
 */
public interface BookService {

    List<Book> getAllBooks();
    void addBook(Book book);
    void updateBook(Book book);
    void viewBook(long id);
}
