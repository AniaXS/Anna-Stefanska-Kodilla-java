package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1, 4, 7, 3, 9, 21, 6, 13, 24, 5, 23, 11, 8, 10, 22, 0, 19, 2, 18, 20};

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(11.3, average, 0);
    }
}
