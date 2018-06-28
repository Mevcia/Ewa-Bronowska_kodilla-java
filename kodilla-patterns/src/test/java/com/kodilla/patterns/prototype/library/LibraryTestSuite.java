package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
//        Given
        Library library = new Library("Book set 1");
        library.getBooks().add(new Book("Abc", "Jan Kowalski", LocalDate.of(2013, 5, 29)));
        library.getBooks().add(new Book("Def", "Adam Nowak", LocalDate.of(1997, 2, 28)));

//        creating shallow copy of Library
        Library shallowLibraryClone = null;
        try {
            shallowLibraryClone = library.shallowCopy();
            shallowLibraryClone.setName("Book set 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

//        creating deep copy of Library
        Library deepLibraryClone = null;
        try {
            deepLibraryClone = library.deepCopy();
            deepLibraryClone.setName("Book set 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

//        When
        library.getBooks().add(new Book("Ghi", "John Bush", LocalDate.of(2019, 12, 31)));

//        Then
        System.out.println(library.getName() + ": " + library.getBooks().toString());
        System.out.println(deepLibraryClone.getName() + ": " + deepLibraryClone.getBooks().toString());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, shallowLibraryClone.getBooks().size());
        Assert.assertNotEquals(deepLibraryClone.getBooks(), library.getBooks());
    }
}
