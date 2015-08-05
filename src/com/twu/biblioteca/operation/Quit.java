package com.twu.biblioteca.operation;


public class Quit implements com.twu.biblioteca.operation.LibraryOperation {

    @Override
    public void execute() {
        System.exit(0);
    }
}
