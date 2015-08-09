package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;

public class DisplayWelcomeMessageView implements IView {

    private Console console;
    private String displayWelcomeMessageView;

    public DisplayWelcomeMessageView(Console console) {
        this.console = console;
        this.displayWelcomeMessageView = "Display Welcome Message View";
    }

    @Override
    public void draw() {
        console.printOutput("++++++++++WELCOME++++++++++");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuDispatcher.loginMenuDispatch(displayWelcomeMessageView);
    }
}
