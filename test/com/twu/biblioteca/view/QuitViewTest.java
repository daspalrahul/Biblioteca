package com.twu.biblioteca.view;


import com.twu.biblioteca.controller.ViewDispatcher;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class QuitViewTest {

    @Test
    public void quitViewReturnsNullAsNextView() {
        IView quitView = new QuitView();
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        assertEquals(null, quitView.next(viewDispatcher));
    }
}