package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void menuKnowsWhatToDisplayForTheUserMenu() {
        Menu menu = new Menu();
        User user = Mockito.mock(User.class);

        Mockito.when(user.isLibrarian()).thenReturn(true);

        assertEquals("List Books\n" +
                "List Movies\n" +
                "Checkin Book\n" +
                "Checkout Book\n" +
                "Checkin Movie\n" +
                "Checkout Movie\n" +
                "List CheckedOut Books\n" +
                "List CheckedOut Movies\n", menu.displayOptionMenuList(user));
    }

}