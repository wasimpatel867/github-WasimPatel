package StreamsAPIInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "communication";

        Map<Character,Long> collect =str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()

                )).entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        collect.forEach((k, v) -> System.out.println(k + " -> " + v));
}
}