package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToUppercase {
    public  static void main(String[] args) {

        List<String> list = Arrays.asList("Ashish", "Vaibhav", "Bapu", "Golu", "Wasim", "BJP");

        List<String>uppercaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
      /*List<String> uppercaseList= list.stream()
                                 .map(s ->  s.toUpperCase())
                                 .collect(Collectors.toList());*/

        System.out.println(uppercaseList);
    }
}
