package com.twu.biblioteca.model;


import java.util.ArrayList;
import java.util.Map;

public class Section {

    private ArrayList<LibraryItem> availableLibraryItemList;
    private Map<LibraryItem, User> checkedOutLibraryItemList;

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

    public boolean checkIn(String givenLibraryItem, User currentUser) {
        for (Map.Entry<LibraryItem, User> entry : checkedOutLibraryItemList.entrySet()) {
            LibraryItem libraryItem = entry.getKey();
            User user = entry.getValue();
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
        for (Map.Entry<LibraryItem, User> entry : checkedOutLibraryItemList.entrySet()) {
            LibraryItem libraryItem = entry.getKey();
            User user = entry.getValue();
            result += libraryItem.toString() + "    " + user.userInformation() + "\n";
        }
        return result;
    }
}
