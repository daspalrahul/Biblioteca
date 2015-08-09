package com.twu.biblioteca.controller;


import com.twu.biblioteca.view.IView;


public class BibliotecaApp {

    private IView currentView;

    public BibliotecaApp(IView currentView) {
        this.currentView = currentView;
    }

    public void start() {
        while(currentView != null) {
            currentView.draw();
            currentView = currentView.next();
        }
    }
}
