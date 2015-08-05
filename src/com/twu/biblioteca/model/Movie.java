package com.twu.biblioteca.model;


public class Movie implements LibraryItem {

    private String title;
    private String year;
    private String director;
    private String rating;

    public Movie(String title, String year, String director, String rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + "    " + year + "    " + director + "    " + rating;
    }

    @Override
    public boolean hasName(String itemName) {
        return title.equals(itemName);
    }
}
