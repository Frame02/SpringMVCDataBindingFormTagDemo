package com.srikar.springmvc.book.domain;

import java.io.Serializable;

/**
 * Created by vedantas on 2/4/2018.
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 123435689L;

    private long id;
    private String title;
    private String author;
    private String isbn;
    private Category category;

    public Book() {
    }

    public Book(long id, String title, String author, String isbn, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
