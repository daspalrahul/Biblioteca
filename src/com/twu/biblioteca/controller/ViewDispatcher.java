package com.twu.biblioteca.controller;


import com.twu.biblioteca.view.IView;


public class ViewDispatcher {

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
    private IView userMenuView;
    private IView loginMenuView;
    private IView listCheckedoutBooksView;
    private IView listCheckedOutMoviesView;
    private IView librarianMenuView;

    public ViewDispatcher(IView listBooksView, IView listMoviesView, IView checkinBookView, IView checkinMovieView, IView checkoutBookView, IView checkoutMovieView, IView logoutView, IView userDetailsView, IView invalidUserMenuOptionView, IView invalidLoginMenuOptionView, IView quitView, IView loginView, IView userMenuView, IView loginMenuView, IView listCheckedoutBooksView, IView listCheckedOutMoviesView, IView librarianMenuView) {
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
        this.userMenuView = userMenuView;
        this.loginMenuView = loginMenuView;
        this.listCheckedoutBooksView = listCheckedoutBooksView;
        this.listCheckedOutMoviesView = listCheckedOutMoviesView;
        this.librarianMenuView = librarianMenuView;
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
            case "Checkin Book View":
                return userMenuView;
            case "Checkin Movie View":
                return userMenuView;
            case "Checkout Book View":
                return userMenuView;
            case "Checkout Movie View":
                return userMenuView;
            case "List Books View":
                return userMenuView;
            case "List Movies View":
                return userMenuView;
            case "User Details View":
                return userMenuView;
            case "Invalid User Menu Option View":
                return userMenuView;
            case "Logout View":
                return loginMenuView;
            default:
                return invalidUserMenuOptionView;
        }
    }

    public IView loginMenuDispatch(String userInput) {
        switch (userInput) {
            case "Display Welcome Message View":
                return loginMenuView;
            case "Login":
                return loginView;
            case "Quit":
                return quitView;
            case "Invalid Login Menu Option View":
                return loginMenuView;
            default:
                return invalidLoginMenuOptionView;
        }
    }

    public IView librarianMenuDispatch(String userInput) {
        IView view = userMenuDispatch(userInput);
        if (view != invalidUserMenuOptionView)
            return view;
        switch (userInput) {
            case "List Checkedout Books":
                return listCheckedoutBooksView;
            case "List Checkedout Movies":
                return listCheckedOutMoviesView;
            case "List Checkedout Books View":
                return librarianMenuView;
            case "List Checkedout Movies View":
                return librarianMenuView;
            default:
                return librarianMenuView;
        }
    }
}
