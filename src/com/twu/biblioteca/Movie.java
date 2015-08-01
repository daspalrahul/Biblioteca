package com.twu.biblioteca;


public class Movie {

    private String name;
    private String year;
    private String director;
    private String unrated;

    public Movie(String name, String year, String director, String unrated) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.unrated = unrated;
    }

    public boolean hasName(String movieName) {
        return movieName.equals(name);
    }
}
