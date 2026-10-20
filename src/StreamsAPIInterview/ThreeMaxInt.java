package StreamsAPIInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxInt {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,8,5,5,9);
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
