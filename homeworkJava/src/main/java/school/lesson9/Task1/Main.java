package school.lesson9.Task1;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = RandomNumbersProcessor.generateRandomNumbers(15, 1, 100);

        System.out.println("Generated numbers: " + numbers);

        long evenNumbers = EvenNumberProcessor.countEvenNumbers(numbers);
        System.out.println("Number of even numbers: " + evenNumbers);

    }
}
