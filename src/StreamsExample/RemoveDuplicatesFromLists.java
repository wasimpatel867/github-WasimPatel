package StreamsExample;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromLists {
    static void main() {
    List<String>  list1 = List.of("a", "b", "c", "d", "e", "f");
    List<String>  list2 = List.of("d", "e", "g", "h", "i", "k");

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        List<String> result = Stream.concat(list1.stream(), list2.stream())
                .filter(item -> !(set1.contains(item) && set2.contains(item)))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
