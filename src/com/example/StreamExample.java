package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static  void main(String[] args) {

        List<String> names = Arrays.asList("Wasim","Vaibhav","Kalpesh","Sachin");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("W"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Names starting with W (in uppercase): " + filteredNames);

    }
}
