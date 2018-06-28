package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
//        Given
        Library library = new Library("Criminals");
        library.getBooks().add(new Book("Abc", "Jan Kowalski", LocalDate.of(2013, 5, 29)));
        library.getBooks().add(new Book("Def", "Adam Nowak", LocalDate.of(1997, 2, 28)));

//        When
//        Then
        Assert.assertEquals(2, library.getBooks().size());
    }
}
