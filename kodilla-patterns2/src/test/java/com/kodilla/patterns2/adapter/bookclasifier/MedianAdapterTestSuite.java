package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2002, "I166"));
        bookSet.add(new Book("Author2", "Title2", 2019, "I173"));
        bookSet.add(new Book("Author3", "Title3", 2011, "I174"));
        bookSet.add(new Book("Author4", "Title4", 1985, "I195"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2006, median);
    }
}