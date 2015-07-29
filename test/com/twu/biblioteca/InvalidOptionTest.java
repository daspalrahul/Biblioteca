package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

public class InvalidOptionTest {

    @Test
    public void invalidOptionKnowsHowToDisplayMessageToConsole() {
        View view = Mockito.mock(View.class);
        InvalidOption invalidOption = new InvalidOption(view);

        invalidOption.execute();

        Mockito.verify(view).displayInvalidCommandMessage();
    }
}