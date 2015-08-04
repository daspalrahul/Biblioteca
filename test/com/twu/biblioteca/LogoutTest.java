package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class LogoutTest {

    @Test
    public void logoutKnowsHoeToLogoutAUser() {
        View view = Mockito.mock(View.class);
        Logout logout = new Logout(view);

        logout.execute();

        Mockito.verify(view).logoutSuccess();
    }

}