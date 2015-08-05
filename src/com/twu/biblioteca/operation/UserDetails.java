package com.twu.biblioteca.operation;

import com.twu.biblioteca.view.View;

public class UserDetails implements LibraryOperation {

    private View view;

    public UserDetails(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.displayUserInformation();
    }
}
