package com.twu.biblioteca.operation;

import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;

public class ListCheckedOutLibraryItems implements LibraryOperation {


    private View view;
    private Section section;

    public ListCheckedOutLibraryItems(View view, Section section) {
        this.view = view;
        this.section = section;
    }

    @Override
    public void execute() {
        view.displayListOfAllCheckedOutLibraryItems(section.listOfAllCheckedOutLIbraryItems());
    }
}
