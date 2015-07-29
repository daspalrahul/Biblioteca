package com.twu.biblioteca;


public class Quit implements LibraryOperation {

    @Override
    public void execute() {
        System.exit(0);
    }
}
