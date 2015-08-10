package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.model.Session;
import com.twu.biblioteca.model.User;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;


public class CheckinBookViewTest {

    @Test
    public void checkInBookViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Section books = Mockito.mock(Section.class);
        Session session = Mockito.mock(Session.class);
        User user = Mockito.mock(User.class);
        IView checkinBookView = new CheckinBookView(console, session, books);

        Mockito.when(session.getCurrentUser()).thenReturn(user);
        Mockito.when(console.getInput()).thenReturn("A Game of Thrones");
        checkinBookView.draw();

        Mockito.verify(books).checkIn(anyString(), eq(user));
    }

    @Test
    public void checkinBookViewKnowsHowToReturnTheNextView() {
        Console console = Mockito.mock(Console.class);
        Section books = Mockito.mock(Section.class);
        Session session = Mockito.mock(Session.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView checkinBookView = new CheckinBookView(console, session, books);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.userMenuDispatch("Checkin Book View")).thenReturn(userMenuView);

        assertEquals(userMenuView, checkinBookView.next(viewDispatcher));
    }
}