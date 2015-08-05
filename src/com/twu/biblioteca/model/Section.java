package com.twu.biblioteca.model;


import java.util.ArrayList;
import java.util.Map;

public class Section {

    private ArrayList<com.twu.biblioteca.model.LibraryItem> availableLibraryItemList;
    private Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> checkedOutLibraryItemList;

    public Section(ArrayList<com.twu.biblioteca.model.LibraryItem> availableLibraryItemList, Map<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> checkedOutLibraryItemList) {
        this.availableLibraryItemList = availableLibraryItemList;
        this.checkedOutLibraryItemList = checkedOutLibraryItemList;
    }


    public ArrayList<com.twu.biblioteca.model.LibraryItem> listOfAllAvailableLibraryItems() {
        return availableLibraryItemList;
    }

    public boolean checkOut(String requestedLibraryItem, com.twu.biblioteca.model.User user) {
        for (com.twu.biblioteca.model.LibraryItem libraryItem : availableLibraryItemList) {
            if (libraryItem.hasName(requestedLibraryItem)) {
                checkedOutLibraryItemList.put(libraryItem, user);
                availableLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }

    public boolean checkIn(String givenLibraryItem, com.twu.biblioteca.model.User currentUser) {
        for (Map.Entry<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> entry : checkedOutLibraryItemList.entrySet()) {
            com.twu.biblioteca.model.LibraryItem libraryItem = entry.getKey();
            com.twu.biblioteca.model.User user = entry.getValue();
            if (libraryItem.hasName(givenLibraryItem) && user == currentUser) {
                availableLibraryItemList.add(libraryItem);
                checkedOutLibraryItemList.remove(libraryItem);
                return true;
            }
        }
        return false;
    }

    public String listOfAllCheckedOutLIbraryItems() {
        String result = "";
        for (Map.Entry<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User> entry : checkedOutLibraryItemList.entrySet()) {
            com.twu.biblioteca.model.LibraryItem libraryItem = entry.getKey();
            com.twu.biblioteca.model.User user = entry.getValue();
            result += libraryItem.toString() + "    " + user.userInformation() + "\n";
        }
        return result;
    }
}
