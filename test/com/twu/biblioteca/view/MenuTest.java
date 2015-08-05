package com.twu.biblioteca.view;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void menuKnowsWhatToDisplayForTheUserMenu() {
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();
        com.twu.biblioteca.model.User user = Mockito.mock(com.twu.biblioteca.model.User.class);

        Mockito.when(user.isLibrarian()).thenReturn(true);

        assertEquals("List Books\n" +
                "List Movies\n" +
                "Checkin Book\n" +
                "Checkout Book\n" +
                "Checkin Movie\n" +
                "Checkout Movie\n" +
                "List CheckedOut Books\n" +
                "List CheckedOut Movies\nLogout\n", menu.displayOptionMenuList(user));
    }

    @Test
    public void menuKnowsWhatToDisplayWhenLogginIn() {
        com.twu.biblioteca.view.Menu menu = new com.twu.biblioteca.view.Menu();

        assertEquals("Login\n" +
                "Quit\n", menu.displayLoginMenu());
    }
}