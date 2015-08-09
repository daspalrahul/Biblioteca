package com.twu.biblioteca.view;


import com.twu.biblioteca.controller.UserMenuDispatcher;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class QuitViewTest {

    @Test
    public void quitViewReturnsNullAsNextView() {
        IView quitView = new QuitView();
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);

        assertEquals(null, quitView.next(userMenuDispatcher));
    }
}