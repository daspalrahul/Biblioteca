package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;


public class CheckoutMovieView implements IView {

    private Console console;
    private Session session;
    private Section movies;
    private String checkoutMovieView;

    public CheckoutMovieView(Console console, Session session, Section movies) {
        this.console = console;
        this.session = session;
        this.movies = movies;
        this.checkoutMovieView = "Checkout Movie View";
    }

    @Override
    public void draw() {
        if (movies.checkOut(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you! Enjoy the movie");
        else
            console.printOutput("That movie is not available.");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuDispatcher.userMenuDispatch(checkoutMovieView);
    }
}
