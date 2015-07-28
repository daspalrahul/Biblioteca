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
import static org.mockito.Matchers.eq;

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
        View view = new View();

        view.displayWelcomeMessage();

        assertEquals("Welcome\n", outContent.toString());
    }

    @Test
    public void viewKnowsHowToDisplayListOfBooks() {
        String[] book = {"A Game of Thrones", "George R. R. Martin", "1996"};
        ArrayList<String[]> listOfBooks = new ArrayList<>(Arrays.asList(book, book));
        View view = new View();

        view.displayListOfBooks(listOfBooks);

        assertEquals("A Game of Thrones George R. R. Martin 1996 \nA Game of Thrones George R. R. Martin 1996 \n", outContent.toString());
    }

    @After
    public void tearDown() {
        System.setOut(original);
    }
}