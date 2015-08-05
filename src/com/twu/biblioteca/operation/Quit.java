package com.twu.biblioteca.operation;


public class Quit implements LibraryOperation {

    @Override
    public void execute() {
        System.exit(0);
    }
}
