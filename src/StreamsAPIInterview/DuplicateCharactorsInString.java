package StreamsAPIInterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactorsInString {
    public static void main(String[] args) {
        String str = "Programming";

        Map<String, Long> collect = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);
    }
}
