package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxArrayInt {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7,8};

        int secondMax = Arrays.stream(arr).boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow(() -> new RuntimeException("no second max charactor"));
        System.out.println(secondMax);

    }
}
