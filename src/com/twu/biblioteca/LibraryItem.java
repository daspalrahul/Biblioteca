package com.twu.biblioteca;

public class LibraryItem {
    protected String name;

    public LibraryItem(String name) {
        this.name = name;
    }

    public boolean hasName(String itemName) {
        return itemName.equals(name);
    }

    @Override
    public String toString() {
        return "";
    }
}
