package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;


abstract public class CheckinItemView implements IView {

    private Console console;
    private Session session;
    private Section section;
    protected String itemName = "";

    public CheckinItemView(Console console, Session session, Section section) {
        this.console = console;
        this.session = session;
        this.section = section;
    }

    @Override
    public void draw() {
        if (section.checkIn(console.getInput(), session.getCurrentUser()))
            console.printOutput("Thank you for returning the " + itemName + ".");
        else
            console.printOutput("That is not a valid " + itemName + " to return.");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(this.toString());
    }

    @Override
    abstract public String toString();
}
