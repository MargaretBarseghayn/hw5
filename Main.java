package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Daniel Kiz", 1927);
        Book book = new Book("The mind of Billy Milligan", author, "Biography");
        //System.out.println(book.getName());
        book.setPrice(250);
        ArrayList<Book> books = author.getBooks();
        for (Book value : books) {
            System.out.println(value.getName());
        }

    }
}
