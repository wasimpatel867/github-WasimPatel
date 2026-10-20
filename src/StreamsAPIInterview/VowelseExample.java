package StreamsAPIInterview;

import java.util.List;
import java.util.stream.Collectors;

public class VowelseExample {
    public static void main(String[] args) {
        String str = "hello";

       List<Character> vowels = str.chars()
                        .mapToObj(c -> (char) c)
                        .filter(ch -> "aeiou".contains(String.valueOf(ch)))
                                .collect(Collectors.toList());

        System.out.println("Number of vowels in the string: " + vowels);
    }
}
