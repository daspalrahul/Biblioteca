package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;

public class LoginView implements IView{

    private Console console;
    private String libraryNumber;
    private String password;

    public LoginView(Console console) {
        this.console = console;
    }

    @Override
    public void draw() {
        console.printOutput("Enter the Library number:");
        libraryNumber = console.getInput();
        console.printOutput("Enter the password");
        password = console.getInput();
    }

    @Override
    public IView next() {
        return null;
    }
}
