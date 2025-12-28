package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMax {
    public  static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,6,7,9,4);

      int secondmax =  list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow(()-> new RuntimeException("no second max integer"));
        System.out.println(secondmax);

        }

    }

