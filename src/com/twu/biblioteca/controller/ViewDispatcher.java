package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;

public class ViewDispatcher {

    IView invalidLoginMenuOptionView;
    IView quitView;
    IView loginView;

    public ViewDispatcher(IView invalidLoginMenuOptionView, IView quitView, IView loginView) {
        this.invalidLoginMenuOptionView = invalidLoginMenuOptionView;
        this.quitView = quitView;
        this.loginView = loginView;
    }

    public IView convertIntoView(String userInput) {
        switch (userInput) {
            case "Login":
                return loginView;
            case "Quit":
                return quitView;
            default:
                return invalidLoginMenuOptionView;
        }
    }
}
