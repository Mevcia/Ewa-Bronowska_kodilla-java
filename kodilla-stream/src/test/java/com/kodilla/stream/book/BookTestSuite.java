package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getTheBookList();

        //Then
        int numberOfBooksPublishedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublishedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublishedAfter2007);
    }
    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getTheBookList();

        //Then
        int numberOfBooksPublishedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() >2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3, numberOfBooksPublishedAfter2007);
    }
    @Test
    public void testGetListUsingIntStream2() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getTheBookList();

        //Then
        long numberOfBooksPublishedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();
        Assert.assertEquals(3, numberOfBooksPublishedAfter2007);
    }
}
