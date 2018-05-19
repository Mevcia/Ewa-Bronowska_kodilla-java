package com.kodilla.stream.array;

import java.util.Arrays;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        return Arrays.stream(numbers)
                .peek(System.out::println)
                .average().orElse(0);
    }
}
