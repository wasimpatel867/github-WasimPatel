package StreamsAPIInterview;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccouranceOfCharactorOnlyOnce {
    public static void main(String[] args) {
        String str = "programming";

       Map<Character,Long> collect = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
             List<Character> list =collect.entrySet()
                       .stream()
                       .filter(e -> e.getValue() == 1)
                       .map(Map.Entry::getKey)
                       .toList();
       System.out.println(list);

    }
}
