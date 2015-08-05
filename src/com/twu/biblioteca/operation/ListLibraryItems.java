package com.twu.biblioteca.operation;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;

public class ListLibraryItems implements LibraryOperation {

    private View view;
    private Section section;

    public ListLibraryItems(View view, Section section) {
        this.view = view;
        this.section = section;
    }

    @Override
    public void execute() {
        view.displayListOfAllAvailableLibraryItems(section);
    }
}
