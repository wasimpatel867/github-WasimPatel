package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumberFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);
   }
}
