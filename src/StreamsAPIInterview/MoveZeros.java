package StreamsAPIInterview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 0, 5, 0, 7};

      int []  result = IntStream.concat(
                Arrays.stream(arr).filter(i -> i != 0),
                Arrays.stream(arr).filter(i -> i == 0)
        ).toArray();
        System.out.println(Arrays.toString(result));

    }
}
