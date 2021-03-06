package com.company;

import java.util.ArrayList;

public class Author {
    private String name;
    private int year = 2020;
    private ArrayList<Book> books = new ArrayList<>();

    public Author() {
    }

    public Author(String name, int year) {
        this.name = name;
        if (year <= 2020)
            this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
