package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Section;
import com.twu.biblioteca.view.View;
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
        Section books = Mockito.mock(Section.class);
        Section movies = Mockito.mock(Section.class);
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        com.twu.biblioteca.controller.Parser parser = new com.twu.biblioteca.controller.Parser(view, loginAuthenticator);

        com.twu.biblioteca.operation.LibraryOperation result = parser.convertIntoLibraryOperation("List Books", books, movies);

        assertEquals(com.twu.biblioteca.operation.ListLibraryItems.class, result.getClass());
    }

    @Test
    public void parserKnowsHowToReturnCheckinOperation() {
        View view = Mockito.mock(View.class);
        Section books = Mockito.mock(Section.class);
        Section movies = Mockito.mock(Section.class);
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        com.twu.biblioteca.controller.Parser parser = new com.twu.biblioteca.controller.Parser(view, loginAuthenticator);

        com.twu.biblioteca.operation.LibraryOperation result = parser.convertIntoLibraryOperation("Checkin Book", books, movies);

        assertEquals(com.twu.biblioteca.operation.Checkin.class, result.getClass());
    }

    @Test
    public void parserKnowsHowToReturnLoginOperation() {
        View view = Mockito.mock(View.class);
        Section books = Mockito.mock(Section.class);
        Section movies = Mockito.mock(Section.class);
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        com.twu.biblioteca.controller.Parser parser = new com.twu.biblioteca.controller.Parser(view, loginAuthenticator);

        com.twu.biblioteca.operation.LibraryOperation result = parser.convertIntoLibraryOperation("Login", books, movies);

        assertEquals(com.twu.biblioteca.operation.Login.class, result.getClass());
    }

    @Test
    public void parserKnowsHowToReturnListCheckedOutLibraryItemOperation() {
        View view = Mockito.mock(View.class);
        Section books = Mockito.mock(Section.class);
        Section movies = Mockito.mock(Section.class);
        LoginAuthenticator loginAuthenticator = Mockito.mock(LoginAuthenticator.class);
        com.twu.biblioteca.controller.Parser parser = new com.twu.biblioteca.controller.Parser(view, loginAuthenticator);

        com.twu.biblioteca.operation.LibraryOperation result = parser.convertIntoLibraryOperation("List CheckedOut Books", books, movies);

        assertEquals(com.twu.biblioteca.operation.ListCheckedOutLibraryItems.class, result.getClass());
    }
}