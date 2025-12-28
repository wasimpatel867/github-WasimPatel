package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAscendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,1,4,8,6,4);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
