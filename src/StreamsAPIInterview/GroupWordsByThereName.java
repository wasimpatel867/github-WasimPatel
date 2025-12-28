package StreamsAPIInterview;

import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsByThereName {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "spring", "boot", "api");

        Map<Integer, List<String>> result = list.stream()
                        .collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
}
