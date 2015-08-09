package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;

public class CheckinMovieView implements IView {

    private Console console;
    private Session session;
    private Section movies;
    private String checkinMovieView;

    public CheckinMovieView(Console console, Session session, Section movies) {
        this.console = console;
        this.session = session;
        this.movies = movies;
        this.checkinMovieView = "Checkin Movie View";
    }

    @Override
    public void draw() {
        if (movies.checkIn(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you for returning the movie.");
        else
            console.printOutput("That is not a valid movie to return.");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuDispatcher.userMenuDispatch(checkinMovieView);
    }
}
