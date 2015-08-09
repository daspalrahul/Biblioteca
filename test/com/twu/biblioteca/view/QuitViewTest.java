package com.twu.biblioteca.view;


import org.junit.Test;

import static org.junit.Assert.*;


public class QuitViewTest {

    @Test
    public void quitViewReturnsNullAsNextView() {
        IView quitView = new QuitView();

        assertEquals(null, quitView.next());
    }
}