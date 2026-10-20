package StreamsAPIInterview;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharactor {
    public static void main(String[] args) {
        String str = "communication";

      Map<Character,Long> frequencymap = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()

                ));
        System.out.println(frequencymap);
    }
}
