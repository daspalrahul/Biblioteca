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
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUp() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void viewKnowsHowToDisplayWelcomeMessage() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayWelcomeMessage();

        Mockito.verify(console).printOutput("Welcome");
    }

    @Test
    public void viewKnowsHowToDisplayListOfBooks() {
        String[] book = {"A Game of Thrones", "George R. R. Martin", "1996"};
        ArrayList<String[]> listOfBooks = new ArrayList<>(Arrays.asList(book, book));
        Library library = new Library(listOfBooks);
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayListOfAllBooks(library);

        assertEquals("   Name                                          Author      Year\n" +
                "1  A Game of Thrones                George R. R. Martin      1996\n" +
                "2  A Game of Thrones                George R. R. Martin      1996\n", outContent.toString());
    }

    @Test
    public void viewCanDisplayListOfAvailableMenu() {
        Console console = Mockito.mock(Console.class);
        View view = new View(console);

        view.displayMenu();

        Mockito.verify(console).printOutput("Enter the action you want to perform");
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

    @After
    public void tearDown() {
        System.setOut(original);
    }
}