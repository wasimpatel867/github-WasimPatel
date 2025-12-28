package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {
    public  static void main(String[] args) {

        String input = "streamapi";
        Map<Character,Long> charCount = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(charCount);
    }
}
