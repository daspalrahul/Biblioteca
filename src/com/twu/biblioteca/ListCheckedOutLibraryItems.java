package com.twu.biblioteca;

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
