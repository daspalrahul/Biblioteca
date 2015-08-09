package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;


public class ListMoviesView implements IView {

    private Console console;
    private IView userMenuView;
    private Section movies;

    public ListMoviesView(Console console, IView userMenuView, Section movies) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.movies = movies;
    }

    @Override
    public void draw() {
        console.printOutput(movies.listOfAllAvailableLibraryItems());
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
