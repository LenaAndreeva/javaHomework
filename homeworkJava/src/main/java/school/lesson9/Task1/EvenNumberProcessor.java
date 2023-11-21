package school.lesson9.Task1;
import java.util.*;

public class EvenNumberProcessor {

    public static long countEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
    }

    // Variant2

    public static long countEvenNumbers2(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(i -> i % 2 == 0)
                .count();
    }
}

