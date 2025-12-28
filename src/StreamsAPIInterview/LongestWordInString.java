package StreamsAPIInterview;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestWordInString {
    public static void main(String[] args) {

        String str = "Good Morning";

        Optional<String> max = Stream.of(str.split(" "))
                .max(Comparator.comparingInt(String::length));
        System.out.println(max);

        Optional<String> min = Stream.of(str.split(" "))
                .min(Comparator.comparingInt(String::length));
        System.out.println(min);
    }
}
