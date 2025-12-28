package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java","Spring Boot","Microservices");

           String longest = words.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse(null);
        System.out.println(longest);
    }
}
