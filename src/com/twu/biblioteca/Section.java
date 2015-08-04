package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Map;

public class Section {

    ArrayList<LibraryItem> availableLibraryItemList;
    Map<LibraryItem, User> checkedOutLibraryItemList;

    public Section(ArrayList<LibraryItem> availableLibraryItemList, Map<LibraryItem, User> checkedOutLibraryItemList) {
        this.availableLibraryItemList = availableLibraryItemList;
        this.checkedOutLibraryItemList = checkedOutLibraryItemList;
    }


    public ArrayList<LibraryItem> listOfAllAvailableLibraryItems() {
        return availableLibraryItemList;
    }

    public boolean checkOut(String requestedLibraryItem, User user) {
        for (LibraryItem libraryItem : availableLibraryItemList) {
            if (libraryItem.hasName(requestedLibraryItem)) {
                checkedOutLibraryItemList.put(libraryItem, user);
                availableLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String givenLibraryItem) {
        for (Map.Entry<LibraryItem, User> entry : checkedOutLibraryItemList.entrySet()) {
            LibraryItem libraryItem = entry.getKey();
            if (libraryItem.hasName(givenLibraryItem)) {
                availableLibraryItemList.add(libraryItem);
                checkedOutLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }
}
