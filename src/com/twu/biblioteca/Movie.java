package com.twu.biblioteca;


public class Movie extends LibraryItem {

    private String year;
    private String director;
    private String rating;

    public Movie(String name, String year, String director, String rating) {
        super(name);
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + "    " + year + "    " + director + "    " + rating;
    }
}
