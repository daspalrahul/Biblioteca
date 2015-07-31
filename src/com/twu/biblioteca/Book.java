package com.twu.biblioteca;


public class Book {

    private String name;
    private String author;
    private String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public boolean hasTitle(String title) {
        if (name.equals(title))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return name + "    " + author + "    " + year;
    }
}
