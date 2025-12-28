package StreamsAPIInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","pineapple","grapefruit","apple",
                "banana");
     Map<String,Long> countmap = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Frequency of Each Word : " + countmap);
    }
}
