package com.twu.biblioteca;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Matchers.eq;

@RunWith(MockitoJUnitRunner.class)
public class ViewTest {

    @Test
    public void viewKnowsHowToDisplayWelcomeMessage() {
        View view = Mockito.mock(View.class);

        view.displayWelcomeMessage();

        Mockito.verify(view).displayWelcomeMessage();
    }

    @Test
    public void viewKnowsHowToDisplayListOfBooks() {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        View view = Mockito.mock(View.class);

        view.displayListOfBooks(listOfBooks);

        Mockito.verify(view).displayListOfBooks(eq(listOfBooks));
    }
}