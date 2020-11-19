package com.company;

public class ElectricalBook extends Book {
    private int loc = 1000;

    public ElectricalBook(String name, Author author, String genre, int loc) {
        super(name, author, genre);
        if (loc >= 1000)
            this.loc = loc;
    }

    public int getLoc() {
        return loc;
    }
}
