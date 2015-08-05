package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class ViewTest {

    @Test
    public void viewKnowsHowToDisplayWelcomeMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayWelcomeMessage();

        Mockito.verify(console).printOutput("Welcome");
    }

    @Test
    public void viewKnowsHowToDisplayListOfBooks() {
        com.twu.biblioteca.model.LibraryItem book = new com.twu.biblioteca.model.Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<com.twu.biblioteca.model.LibraryItem> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        listOfBooks.add(book);
        com.twu.biblioteca.model.Section books = new com.twu.biblioteca.model.Section(listOfBooks,  new HashMap<com.twu.biblioteca.model.LibraryItem, com.twu.biblioteca.model.User>());
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayListOfAllAvailableLibraryItems(books);

        Mockito.verify(console,times(2)).printOutput(anyString());
    }

    @Test
    public void viewCanDisplayInvalidCommandMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayInvalidCommandMessage();

        Mockito.verify(console).printOutput("Select a valid option!");
    }

    @Test
    public void viewCanDisplaySuccessfulCheckoutMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displaySuccessfulCheckOutMessage(com.twu.biblioteca.model.Book.class);

        Mockito.verify(console).printOutput("Thank you! Enjoy the book");
    }

    @Test
    public void viewCanDisplayUnSuccessfulCheckoutMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayUnSuccessfulCheckOutMessage(com.twu.biblioteca.model.Book.class);

        Mockito.verify(console).printOutput("That book is not available.");
    }

    @Test
    public void viewCanDisplaySuccessfulCheckinMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displaySuccessfulCheckinMessage(com.twu.biblioteca.model.Book.class);

        Mockito.verify(console).printOutput("Thank you for returning the book.");
    }

    @Test
    public void viewCanDisplayUnSuccessfulCheckinMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayUnSuccessfulCheckinMessage(com.twu.biblioteca.model.Book.class);

        Mockito.verify(console).printOutput("That is not a valid book to return.");
    }

    @Test
    public void viewCanDisplayInvalidLoginMessage() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayUnsuccessfulLoginMessage();

        Mockito.verify(console).printOutput("Invalid User");
    }

    @Test
    public void viewCanDoSuccessfulLogin() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);

        view.successfulLogin(user);

        Mockito.verify(console).printOutput(anyString());
    }

    @Test
    public void viewKnowsHowToDisplayLoginMenu() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = Mockito.mock(com.twu.biblioteca.view.Menu.class);
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayLoginMenu();

        Mockito.verify(console).printOutput(anyString());
    }

    @Test
    public void viewKnowsHowToSuccessfullyLogout() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = Mockito.mock(com.twu.biblioteca.view.Menu.class);
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.logoutSuccess();

        Mockito.verify(console).printOutput(anyString());
    }

    @Test
    public void viewKnowsHowToDisplayListOfAllCheckedOutItems() {
        Console console = Mockito.mock(Console.class);
        com.twu.biblioteca.view.Menu menu = Mockito.mock(com.twu.biblioteca.view.Menu.class);
        com.twu.biblioteca.view.View view = new com.twu.biblioteca.view.View(console, menu);

        view.displayListOfAllCheckedOutLibraryItems("list");

        Mockito.verify(console).printOutput(anyString());
    }
}
