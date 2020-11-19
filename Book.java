package com.company;

public class Book {
    private final String name;
    private final Author author;
    private double price = 100;
    private final String genre;

    public Book(String name, Author author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        author.addBook(this);
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 100)
            this.price = price;
    }

}
