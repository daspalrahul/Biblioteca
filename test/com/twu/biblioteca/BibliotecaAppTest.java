package com.twu.biblioteca;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class BibliotecaAppTest {

    @Test
    public void bibliotecaAppKnowsHowToRun() {
        View view = Mockito.mock(View.class);
        ArrayList<String[]> list = new ArrayList<>();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(list, view);

        Mockito.when(view.getUserInput()).thenReturn("List Books").thenReturn("Quit");
        bibliotecaApp.start();

        Mockito.verify(view,times(2)).displayMenu();
    }

    @Test
    public void bibliotecaAppCanGetUserInput() {
        View view = Mockito.mock(View.class);
        ArrayList<String[]> list = new ArrayList<>();
        BibliotecaApp bibliotecaApp = new BibliotecaApp(list, view);

        Mockito.when(view.getUserInput()).thenReturn("Quit");
        bibliotecaApp.start();

        Mockito.verify(view).getUserInput();
    }
}