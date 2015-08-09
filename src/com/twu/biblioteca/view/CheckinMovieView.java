package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckinMovieView implements IView {

    private Console console;
    private IView userMenuView;
    private Session session;
    private Section movies;

    public CheckinMovieView(Console console, IView userMenuView, Session session, Section movies) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.session = session;
        this.movies = movies;
    }

    @Override
    public void draw() {
        if (movies.checkIn(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you for returning the movie.");
        else
            console.printOutput("That is not a valid book to return.");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
