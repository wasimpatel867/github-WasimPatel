package com.arrayexample;

public class SecondHIghest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 4, 6};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;

            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No valid second highest number found");
        }  else {
                System.out.println("Second highest number is: " + secondHighest);

            }
        }
    }
    //Find the second highest salary from Employee table

/* SELECT MAX(salary) AS SecondHighestSalary
     FROM Employee
             WHERE salary < (SELECT MAX(salary) FROM Employee)

 */

