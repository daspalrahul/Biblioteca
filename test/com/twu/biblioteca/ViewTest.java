package com.twu.biblioteca;


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
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayWelcomeMessage();

        Mockito.verify(console).printOutput("Welcome");
    }

    @Test
    public void viewKnowsHowToDisplayListOfBooks() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        listOfBooks.add(book);
        Section books = new Section(listOfBooks,  new HashMap<LibraryItem, User>());
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayListOfAllBooks(books);

        Mockito.verify(console,times(2)).printOutput(anyString());
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayMenu();

        Mockito.verify(console, times(2)).printOutput(anyString());
    }

    @Test
    public void viewCanDisplayInvalidCommandMessage() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayInvalidCommandMessage();

        Mockito.verify(console).printOutput("Select a valid option!");
    }

    @Test
    public void viewCanDisplaySuccessfulCheckoutMessage() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displaySuccessfulCheckOutMessage(Book.class);

        Mockito.verify(console).printOutput("Thank you! Enjoy the book");
    }

    @Test
    public void viewCanDisplayUnSuccessfulCheckoutMessage() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayUnSuccessfulCheckOutMessage(Book.class);

        Mockito.verify(console).printOutput("That book is not available.");
    }

    @Test
    public void viewCanDisplaySuccessfulCheckinMessage() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displaySuccessfulCheckinMessage(Book.class);

        Mockito.verify(console).printOutput("Thank you for returning the book.");
    }

    @Test
    public void viewCanDisplayUnSuccessfulCheckinMessage() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayUnSuccessfulCheckinMessage(Book.class);

        Mockito.verify(console).printOutput("That is not a valid book to return.");
    }

    @Test
    public void viewCanDisplayInvalidLoginMessage() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);

        view.displayUnsuccessfulLoginMessage();

        Mockito.verify(console).printOutput("Invalid User");
    }

    @Test
    public void viewCanDoSuccessfulLogin() {
        Console console = Mockito.mock(Console.class);
        Menu menu = new Menu();
        View view = new View(console, menu);
        User user = Mockito.mock(User.class);

        view.successfulLogin(user);

        Mockito.verify(console).printOutput(anyString());
    }

    @Test
    public void viewKnowsHowToDisplayLoginMenu() {
        Console console = Mockito.mock(Console.class);
        Menu menu = Mockito.mock(Menu.class);
        User user = Mockito.mock(User.class);
        View view = new View(console, menu);

        Mockito.when(menu.displayOptionMenuList(user)).thenReturn("menu");
        view.displayLoginMenu();

        Mockito.verify(console).printOutput(anyString());
    }
}
