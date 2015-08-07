package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class InvalidOptionViewTest {

    @Test
    public void invalidOptionTestKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        IView invalidOptionTest = new InvalidOptionView(console);

        invalidOptionTest.draw();

        Mockito.verify(console).printOutput("Select a valid option!");
    }
}