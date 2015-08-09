package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


public class UserDetailsViewTest {

    @Test
    public void userDetailsViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Session session = Mockito.mock(Session.class);
        User user = Mockito.mock(User.class);
        IView userDetailsView = new UserDetailsView(console, session);

        Mockito.when(session.getCurrentUser()).thenReturn(user);
        userDetailsView.draw();

        Mockito.verify(console).printOutput(user);
    }

    @Test
    public void userDetailsViewKnowsWhatViewToGoToNext() {
        Console console = Mockito.mock(Console.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        Session session = Mockito.mock(Session.class);
        IView userDetailsView = new UserDetailsView(console, session);
        UserMenuDispatcher userMenuDispatcher = Mockito.mock(UserMenuDispatcher.class);

        Mockito.when(userMenuDispatcher.userMenuDispatch("User Details View")).thenReturn(userMenuView);

        assertEquals(userMenuView, userDetailsView.next(userMenuDispatcher));
    }
}