package com.twu.biblioteca.controller;


import com.twu.biblioteca.view.IView;


public class BibliotecaApp {

    private IView currentView;
    private ViewDispatcher viewDispatcher;

    public BibliotecaApp(IView currentView, ViewDispatcher viewDispatcher) {
        this.currentView = currentView;
        this.viewDispatcher = viewDispatcher;
    }

    public void start() {
        while(currentView != null) {
            currentView.draw();
            currentView = currentView.next(viewDispatcher);
        }
    }
}
