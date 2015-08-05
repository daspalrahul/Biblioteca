package com.twu.biblioteca.operation;


import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;

public class InvalidOptionTest {

    @Test
    public void invalidOptionKnowsHowToDisplayMessageToConsole() {
        View view = Mockito.mock(View.class);
        com.twu.biblioteca.operation.InvalidOption invalidOption = new com.twu.biblioteca.operation.InvalidOption(view);

        invalidOption.execute();

        Mockito.verify(view).displayInvalidCommandMessage();
    }
}