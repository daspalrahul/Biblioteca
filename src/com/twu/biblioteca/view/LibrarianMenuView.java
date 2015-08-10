package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Session;

public class LibrarianMenuView implements IView {

    private Console console;
    private Menu menu;
    private Session session;

    public LibrarianMenuView(Console console, Menu menu, Session session) {
        this.console = console;
        this.menu = menu;
        this.session = session;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayOptionMenuList(session.getCurrentUser()));
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.librarianMenuDispatch(console.getInput());
    }
}
