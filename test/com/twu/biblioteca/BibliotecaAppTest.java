package com.twu.biblioteca;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaAppTest {

    @Test
    public void bibliotecaAppKnowsHowToRun() {
        View mockView = Mockito.mock(View.class);
        ArrayList<String> list = new ArrayList<>();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(list, mockView);

        bibliotecaApp.start();

        Mockito.verify(mockView).displayListOfBooks(list);
    }
}