package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;


public class CheckoutMovieView implements IView {

    private Console console;
    private IView userMenuView;
    private Session session;
    private Section movies;

    public CheckoutMovieView(Console console, IView userMenuView, Session session, Section movies) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.session = session;
        this.movies = movies;
    }

    @Override
    public void draw() {
        if (movies.checkOut(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you! Enjoy the movie");
        else
            console.printOutput("That movie is not available.");
    }

    @Override
    public IView next() {
        return userMenuView;
    }
}
