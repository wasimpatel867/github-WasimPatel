package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22,23,25,23,22,4);

        List<Integer> unique = numbers.stream()
                        .distinct()
                                .toList();
        /* numbers.stream()
                 .distinct()
                 .forEach(System.out::println);

         */
      System.out.println(unique);
    }
}
