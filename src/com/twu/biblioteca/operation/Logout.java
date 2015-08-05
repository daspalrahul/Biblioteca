package com.twu.biblioteca.operation;


import com.twu.biblioteca.view.View;

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
