package school.lesson9.Task1;
import java.util.*;

public class MainVar2 {
    public static void main(String[] args) {

        // Variant 2

        int[] arrayOfNumbers = RandomNumbersProcessor.generateRandomNumbers2(15);

        System.out.println("Generated numbers: " + Arrays.toString(arrayOfNumbers));

        long even = EvenNumberProcessor.countEvenNumbers2(arrayOfNumbers);
        System.out.println("Number of even numbers: " + even);
    }
}
