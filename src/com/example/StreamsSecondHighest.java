package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsSecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 9, 12, 3, 7, 19);

      Integer secondHighest =  numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Highest: " + secondHighest);
    }
}
