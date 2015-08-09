package com.twu.biblioteca.controller;


import com.twu.biblioteca.view.IView;


public class UserMenuDispatcher {

    private IView listBooksView;
    private IView listMoviesView;
    private IView checkinBookView;
    private IView checkinMovieView;
    private IView checkoutBookView;
    private IView checkoutMovieView;
    private IView logoutView;
    private IView userDetailsView;
    private IView invalidUserMenuOptionView;
    private IView invalidLoginMenuOptionView;
    private IView quitView;
    private IView loginView;

    public void setViews(IView listBooksView, IView listMoviesView, IView checkinBookView, IView checkinMovieView, IView checkoutBookView, IView checkoutMovieView, IView logoutView, IView userDetailsView, IView invalidUserMenuOptionView, IView invalidLoginMenuOptionView, IView quitView, IView loginView) {
        this.listBooksView = listBooksView;
        this.listMoviesView = listMoviesView;
        this.checkinBookView = checkinBookView;
        this.checkinMovieView = checkinMovieView;
        this.checkoutBookView = checkoutBookView;
        this.checkoutMovieView = checkoutMovieView;
        this.logoutView = logoutView;
        this.userDetailsView = userDetailsView;
        this.invalidUserMenuOptionView = invalidUserMenuOptionView;
        this.invalidLoginMenuOptionView = invalidLoginMenuOptionView;
        this.quitView = quitView;
        this.loginView = loginView;
    }

    public IView userMenuDispatch(String userInput) {
        switch (userInput) {
            case "List Books":
                return listBooksView;
            case "List Movies":
                return listMoviesView;
            case "Checkin Book":
                return checkinBookView;
            case "Checkin Movie":
                return checkinMovieView;
            case "Checkout Book":
                return checkoutBookView;
            case "Checkout Movie":
                return checkoutMovieView;
            case "Logout":
                return logoutView;
            case "User Details":
                return userDetailsView;
            default:
                return invalidUserMenuOptionView;
        }
    }

    public IView loginMenuDispatch(String userInput) {
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
