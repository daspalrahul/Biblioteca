package com.twu.biblioteca;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ParserTest {

    @Test
    public void parserKnowsHowToReturnLibraryOperation() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        Parser parser = new Parser(view);

        LibraryOperation result = parser.convertIntoLibraryOperation("List Books", library);

        assertEquals(ListBooks.class, result.getClass());
    }

    @Test
    public void parserKnowsHowToReturnCheckinOperation() {
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);
        Parser parser = new Parser(view);

        LibraryOperation result = parser.convertIntoLibraryOperation("Checkin", library);

        assertEquals(Checkin.class, result.getClass());
    }

}