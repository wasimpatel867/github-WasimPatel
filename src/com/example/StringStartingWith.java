package com.example;

import java.util.Arrays;
import java.util.List;

public class StringStartingWith {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Ashish", "Vaibhav", "Bapu", "Golu", "Wasim", "BJP");

        List<String> count = words.stream()
                .filter(s -> s.startsWith("S"))
                        .toList();
         long counts = words.stream()
                         .filter(s -> s.startsWith("R"))
                                 .count();;
        System.out.println(count);
        System.out.println(counts);
    }
}
