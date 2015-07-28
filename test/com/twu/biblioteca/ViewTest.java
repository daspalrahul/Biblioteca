package com.twu.biblioteca;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ViewTest {

    @Test
    public void viewKnowsHowToDisplayWelcomeMessage() {
        View view = Mockito.mock(View.class);

        view.displayWelcomeMessage();

        Mockito.verify(view).displayWelcomeMessage();
    }
}