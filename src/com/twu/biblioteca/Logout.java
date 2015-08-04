package com.twu.biblioteca;


public class Logout implements LibraryOperation {

    private View view;

    public Logout(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.logoutSuccess();
    }
}
