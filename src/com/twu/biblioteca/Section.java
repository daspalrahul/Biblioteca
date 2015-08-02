package com.twu.biblioteca;


import java.util.ArrayList;

public class Section {

    ArrayList<LibraryItem> availableLibraryItemList;
    ArrayList<LibraryItem> checkedOutLibraryItemList;

    public Section(ArrayList<LibraryItem> availableLibraryItemList, ArrayList<LibraryItem> checkedOutLibraryItemList) {
        this.availableLibraryItemList = availableLibraryItemList;
        this.checkedOutLibraryItemList = checkedOutLibraryItemList;
    }


    public ArrayList<LibraryItem> listOfAllAvailableLibraryItems() {
        return availableLibraryItemList;
    }

    public boolean checkOut(String requestedLibraryItem) {
        for (LibraryItem libraryItem : availableLibraryItemList) {
            if (libraryItem.hasName(requestedLibraryItem)) {
                checkedOutLibraryItemList.add(libraryItem);
                availableLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String givenLibraryItem) {
        for (LibraryItem libraryItem : checkedOutLibraryItemList) {
            if (libraryItem.hasName(givenLibraryItem)) {
                availableLibraryItemList.add(libraryItem);
                checkedOutLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }
}
