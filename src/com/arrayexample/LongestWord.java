package com.arrayexample;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String [] words = {"Apple","pineapple","banana","plum","TheAshishBorse"};
//Two ways logic for same code
      /*  String longestWord = Arrays.stream(words)
                 .max((a,b) -> Integer.compare(a.length(),b.length()))
                 .orElse(null);*/

        String longestWord = Arrays.stream(words)
                        .max(Comparator.comparingInt(String::length))
                                .orElse(null);

         System.out.println("Rich Man : " + longestWord);
    }
}
