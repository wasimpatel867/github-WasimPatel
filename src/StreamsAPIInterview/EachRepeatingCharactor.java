package StreamsAPIInterview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachRepeatingCharactor {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character,Long> Charcount = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        System.out.println(Charcount);
    }
}
