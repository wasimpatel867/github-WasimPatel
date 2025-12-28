package com.example;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class StringLengthSum {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Joe", "Wasim", "Vaibhav", "Sachin", "Kalpesh");

        int totalLength = names.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println("Total length of all strings: " + totalLength);


    }
}
