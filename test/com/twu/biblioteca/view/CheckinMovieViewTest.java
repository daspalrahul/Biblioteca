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


public class CheckinMovieViewTest {

    @Test
    public void checkinMovieViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Section movies = Mockito.mock(Section.class);
        Session session = Mockito.mock(Session.class);
        User user = Mockito.mock(User.class);
        IView checkinMovieView = new CheckinMovieView(console, session, movies);

        Mockito.when(session.getCurrentUser()).thenReturn(user);
        Mockito.when(console.getInput()).thenReturn("Kick");
        checkinMovieView.draw();

        Mockito.verify(movies).checkIn(anyString(), eq(user));
    }

    @Test
    public void checkinMovieViewKnowsHowToReturnTheNextView() {
        Console console = Mockito.mock(Console.class);
        Section movies = Mockito.mock(Section.class);
        Session session = Mockito.mock(Session.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView checkinMovieView = new CheckinMovieView(console, session, movies);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.userMenuDispatch("Checkin Movie View")).thenReturn(userMenuView);

        assertEquals(userMenuView, checkinMovieView.next(viewDispatcher));
    }
}