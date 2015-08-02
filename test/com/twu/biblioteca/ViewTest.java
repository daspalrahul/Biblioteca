package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class ViewTest {

    @Test
    public void viewKnowsHowToDisplayWelcomeMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayWelcomeMessage();

        Mockito.verify(console).printOutput("Welcome");
    }

    @Test
    public void viewKnowsHowToDisplayListOfBooks() {
        LibraryItem book = new Book("A Game Of Thrones", "George R.R. Martin", "1996");
        ArrayList<LibraryItem> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        listOfBooks.add(book);
        Section books = new Section(listOfBooks,  new ArrayList<LibraryItem>());
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayListOfAllBooks(books);

        Mockito.verify(console,times(2)).printOutput(anyString());
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayMenu();

        Mockito.verify(console, times(2)).printOutput(anyString());
    }

    @Test
    public void viewCanDisplayInvalidCommandMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayInvalidCommandMessage();

        Mockito.verify(console).printOutput("Select a valid option!");
    }

    @Test
    public void viewCanDisplaySuccessfulCheckoutMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displaySuccessfulCheckOutMessage();

        Mockito.verify(console).printOutput("Thank you! Enjoy the book");
    }

    @Test
    public void viewCanDisplayUnSuccessfulCheckoutMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayUnSuccessfulCheckOutMessage();

        Mockito.verify(console).printOutput("That book is not available.");
    }

    @Test
    public void viewCanDisplaySuccessfulCheckinMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displaySuccessfulCheckinMessage();

        Mockito.verify(console).printOutput("Thank you for returning the book.");
    }

    @Test
    public void viewCanDisplayUnSuccessfulCheckinMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayUnSuccessfulCheckinMessage();

        Mockito.verify(console).printOutput("That is not a valid book to return.");
    }

}