package com.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// String k ="vinaykumar"
//output a:2
public class IsAlphetic {
    public static void main(String[] args) {
        String k = "vinaykumar";

        Map<Character, Long> map = k.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isAlphabetic)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " +
                        entry.getValue()));
    }
}