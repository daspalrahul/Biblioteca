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


public class CheckoutMovieViewTest {

    @Test
    public void checkoutMovieViewKnowsHowToDrawItself() {
        Console console = Mockito.mock(Console.class);
        Section movies = Mockito.mock(Section.class);
        Session session = Mockito.mock(Session.class);
        User user = Mockito.mock(User.class);
        IView checkoutMovieView = new CheckoutMovieView(console, session, movies);

        Mockito.when(session.getCurrentUser()).thenReturn(user);
        Mockito.when(console.getInput()).thenReturn("Kick");
        checkoutMovieView.draw();

        Mockito.verify(movies).checkOut(anyString(), eq(user));
    }

    @Test
    public void checkoutMovieViewKnowsHowToReturnTheNextView() {
        Console console = Mockito.mock(Console.class);
        Section movies = Mockito.mock(Section.class);
        Session session = Mockito.mock(Session.class);
        IView userMenuView = Mockito.mock(UserMenuView.class);
        IView checkoutMovieView = new CheckoutMovieView(console, session, movies);
        ViewDispatcher viewDispatcher = Mockito.mock(ViewDispatcher.class);

        Mockito.when(viewDispatcher.userMenuDispatch("Checkout Movie View")).thenReturn(userMenuView);

        assertEquals(userMenuView, checkoutMovieView.next(viewDispatcher));
    }
}