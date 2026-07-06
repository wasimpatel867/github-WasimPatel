package StreamsAPIInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

       int secondHighest = Arrays.stream(arr)
               .distinct()
               .boxed()
               .sorted(Collections.reverseOrder())
               .skip(1)
               .findFirst()
               .orElse(Integer.MIN_VALUE);
        System.out.println(secondHighest);

    }
}
