package com.StringExample;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharactor {
    public static void main(String[] args) {
        String str = "programming";

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                System.out.println("First Reapeating Charactor: " + ch);
                return;
            }
        }
    }

}
