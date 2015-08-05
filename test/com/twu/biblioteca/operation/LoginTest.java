package com.twu.biblioteca.operation;


import com.twu.biblioteca.controller.LoginAuthenticator;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Matchers.anyString;


public class LoginTest {

    @Test
    public void loginKnowsIfTheLoginIsSuccessful() {
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        View view = Mockito.mock(View.class);
        User user = Mockito.mock(User.class);
        com.twu.biblioteca.operation.Login login = new com.twu.biblioteca.operation.Login(view, loginAuthenticator);

        Mockito.when(loginAuthenticator.authenticateUser(anyString(), anyString())).thenReturn(user);
        login.execute();

        Mockito.verify(view).successfulLogin(user);
    }

}
