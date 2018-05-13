package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void shouldReturnAverage() {
        //Given
        int[] numbers = {1, 99, 3, 5, 44, 66, 7, 9, 6, 31, 5, 11, 8, 12, 19, 26, 2, 4, 70, 22};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(22.5, average, 0.0001);
    }
}
