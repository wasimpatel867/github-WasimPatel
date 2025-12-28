package com.example;

import java.util.Comparator;

public class SecondMaxFromString {
    public static void main(String[] args) {
        String str =  "abzxyza";
       char secondMaxChar = str.chars()
               .mapToObj(c -> (char) c )
               .distinct().sorted(Comparator.reverseOrder())
               .skip(1)
               .findFirst()
                       .orElseThrow(() -> new RuntimeException("no second max charactor"));
        System.out.println(secondMaxChar);
    }
}
