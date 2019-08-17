package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StatisticsTestSuite {
    @Test
    public void testAveragePublicationYearForNoBooks() {
        //Given
        Map<BookSignature, Book> bookMap = new HashMap<>();
        Statistics statistics = new Statistics();
        //When
        int average = statistics.averagePublicationYear(bookMap);
        //Then
        assertEquals(0, average);
    }

    @Test
    public void testAveragePublicationYear() {
        //Given
        Book book1 = new Book("Author1", "Title1", 2002);
        Book book2 = new Book("Author2", "Title2", 2019);
        Book book3 = new Book("Author3", "Title3", 2011);
        Book book4 = new Book("Author4", "Title4", 1985);
        BookSignature bookSignature1 = new BookSignature("I111");
        BookSignature bookSignature2 = new BookSignature("I113");
        BookSignature bookSignature3 = new BookSignature("I124");
        BookSignature bookSignature4 = new BookSignature("I147");
        Map<BookSignature, Book> bookMap = new HashMap<>();
        bookMap.put(bookSignature1, book1);
        bookMap.put(bookSignature2, book2);
        bookMap.put(bookSignature3, book3);
        bookMap.put(bookSignature4, book4);
        Statistics statistics = new Statistics();
        //When
        int average = statistics.averagePublicationYear(bookMap);
        //Then
        assertEquals(2004, average);
    }

    @Test
    public void testMedianPublicationYearForNoBooks() {
        //Given
        Map<BookSignature, Book> bookMap = new HashMap<>();
        Statistics statistics = new Statistics();
        //When
        int median = statistics.medianPublicationYear(bookMap);
        //Then
        assertEquals(0, median);
    }

    @Test
    public void testMedianPublicationYearForEvenNumberOfBooks() {
        //Given
        Book book1 = new Book("Author1", "Title1", 2002);
        Book book2 = new Book("Author2", "Title2", 2019);
        Book book3 = new Book("Author3", "Title3", 2011);
        Book book4 = new Book("Author4", "Title4", 1985);
        BookSignature bookSignature1 = new BookSignature("I111");
        BookSignature bookSignature2 = new BookSignature("I113");
        BookSignature bookSignature3 = new BookSignature("I124");
        BookSignature bookSignature4 = new BookSignature("I147");
        Map<BookSignature, Book> bookMap = new HashMap<>();
        bookMap.put(bookSignature1, book1);
        bookMap.put(bookSignature2, book2);
        bookMap.put(bookSignature3, book3);
        bookMap.put(bookSignature4, book4);
        Statistics statistics = new Statistics();
        //When
        int median = statistics.medianPublicationYear(bookMap);
        //Then
        assertEquals(2006, median);
    }

    @Test
    public void testMedianPublicationYearForOddNumberOfBooks() {
        //Given
        Book book1 = new Book("Author1", "Title1", 2002);
        Book book2 = new Book("Author2", "Title2", 2019);
        Book book3 = new Book("Author3", "Title3", 2007);
        BookSignature bookSignature1 = new BookSignature("I111");
        BookSignature bookSignature2 = new BookSignature("I113");
        BookSignature bookSignature3 = new BookSignature("I124;");
        Map<BookSignature, Book> bookMap = new HashMap<>();
        bookMap.put(bookSignature1, book1);
        bookMap.put(bookSignature2, book2);
        bookMap.put(bookSignature3, book3);
        Statistics statistics = new Statistics();
        //When
        int median = statistics.medianPublicationYear(bookMap);
        //Then
        assertEquals(2007, median);
    }
}