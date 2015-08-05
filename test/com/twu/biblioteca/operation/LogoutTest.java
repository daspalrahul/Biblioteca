package com.twu.biblioteca.operation;


import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;

public class LogoutTest {

    @Test
    public void logoutKnowsHoeToLogoutAUser() {
        View view = Mockito.mock(View.class);
        com.twu.biblioteca.operation.Logout logout = new com.twu.biblioteca.operation.Logout(view);

        logout.execute();

        Mockito.verify(view).logoutSuccess();
    }

}