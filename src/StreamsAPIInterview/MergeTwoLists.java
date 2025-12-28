package StreamsAPIInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 4, 8, 5, 10);

       List<Integer> list = Stream.concat(list1.stream(), list2.stream())
                .distinct().toList();
        System.out.println(list);

    }
}
