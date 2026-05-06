package StreamsAPIInterview;

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 6, 8, 5, 9, 0, 3, 4);

        // Method 1: Using mapToInt (Current approach - works fine)
        int sum1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers (mapToInt): " + sum1);

        // Method 2: Direct sum without mapToInt (More concise)
        int sum2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("Sum of even numbers (reduce): " + sum2);

        // Method 3: Using collect with Collectors.summingInt (Alternative)
        Integer sum3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(java.util.stream.Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of even numbers (collect): " + sum3);
    }
}
