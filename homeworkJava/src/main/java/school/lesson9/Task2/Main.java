package school.lesson9.Task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Highload", "High", "Load", "Highload");

        long countofHigh = FindElementsProcessor.countOfEl(words);
        System.out.println("'High' appears " + countofHigh + " time/times");

        String firstEl = FindElementsProcessor.findFirsEl(words);
        System.out.println("First element in the collection: " + firstEl);

        String lastEl = FindElementsProcessor.findLastEl(words);
        System.out.println("Last element in the collection: " + lastEl);
    }
}
