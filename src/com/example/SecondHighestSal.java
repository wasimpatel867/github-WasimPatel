package com.example;

import java.util.*;

public class SecondHighestSal {
    public static void main(String[] args) {

        List<Employees> employees = Arrays.asList(
                new Employees("Ram",1,50000),
                new Employees("Shyam",2,70000),
                new Employees("Rahul",3,60000),
                new Employees("Pooja",4,70000),
                new Employees("Amit",5,55000)
        );
      Optional<Double> secondHighestSalary = employees.stream()
                .map(Employees::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (secondHighestSalary.isPresent()){
            System.out.println("secondHighestSalary: " + secondHighestSalary.get());
        } else {
            System.out.println("no secondHighestSalary");
        }
    }
}
