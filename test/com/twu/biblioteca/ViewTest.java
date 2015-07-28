package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void viewKnowsHowToDisplayWelcomeMessage() {
        View view = Mockito.mock(View.class);

        view.displayWelcomeMessage();

        Mockito.verify(view).displayWelcomeMessage();
    }

    @Test
    public void viewsKnowsThatTheWelcomeMessageIsCorrect() {
        View view = new View();

        view.displayWelcomeMessage();

        assertEquals("Welcome\n", outContent.toString());
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }
}