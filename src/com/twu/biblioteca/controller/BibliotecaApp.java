package com.twu.biblioteca.controller;


import com.twu.biblioteca.view.IView;


public class BibliotecaApp {

    private IView currentView;
    private UserMenuDispatcher userMenuDispatcher;

    public BibliotecaApp(IView currentView, UserMenuDispatcher userMenuDispatcher) {
        this.currentView = currentView;
        this.userMenuDispatcher = userMenuDispatcher;
    }

    public void start() {
        while(currentView != null) {
            currentView.draw();
            currentView = currentView.next(userMenuDispatcher);
        }
    }
}
