package com.twu.biblioteca.operation;


import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class UserDetailsTest {

    @Test
    public void userDetailsKnowsHowToListUserDetails() {
        View view = Mockito.mock(View.class);
        UserDetails userDetails = new UserDetails(view);

        userDetails.execute();

        Mockito.verify(view).displayUserInformation();
    }
}