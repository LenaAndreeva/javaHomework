package school.lesson9.Task1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

public class RandomNumbersProcessor {

    public static List<Integer> generateRandomNumbers(int count, int min, int max) {
        Random random = new Random();
        return random.ints(count, min, max + 1)
                .boxed()
                .collect(Collectors.toList());
    }

    // Variant2

    public static int[] generateRandomNumbers2(int count) {
        return IntStream.range(0, count)
                .map(n -> (int) (Math.random() * 10))
                .toArray();
    }
}
