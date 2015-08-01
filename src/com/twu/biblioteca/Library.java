package com.twu.biblioteca;


import java.util.ArrayList;

public class Library {

    ArrayList<LibraryItem> availableLibraryItemList;
    ArrayList<LibraryItem> checkedOutLibraryItemList;

    public Library(ArrayList<LibraryItem> availableLibraryItemList, ArrayList<LibraryItem> checkedOutLibraryItemList) {
        this.availableLibraryItemList = availableLibraryItemList;
        this.checkedOutLibraryItemList = checkedOutLibraryItemList;
    }


    public ArrayList<LibraryItem> listOfAllAvailableBooks() {
        ArrayList<LibraryItem> availableBookList = new ArrayList<>();
        for (LibraryItem libraryItem : availableLibraryItemList) {
            if (libraryItem.getClass() == Book.class)
                availableBookList.add(libraryItem);
        }
        return availableBookList;
    }

    public boolean checkOut(String requestedBook) {
        for (LibraryItem libraryItem : availableLibraryItemList) {
            if (libraryItem.hasName(requestedBook)) {
                checkedOutLibraryItemList.add(libraryItem);
                availableLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String book) {
        for (LibraryItem libraryItem : checkedOutLibraryItemList) {
            if (libraryItem.hasName(book)) {
                availableLibraryItemList.add(libraryItem);
                checkedOutLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }
}
