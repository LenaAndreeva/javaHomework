package school.lesson9.Task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        WordsData wordsData = new WordsData();

        long countOfWord = FindElementsProcessor.countOfEl(wordsData.getWords());
        System.out.println("'High' appears " + countOfWord + " time/times");

        String firstEl = FindElementsProcessor.findFirsEl(wordsData.getWords());
        System.out.println("First element in the collection: " + firstEl);

        String lastEl = FindElementsProcessor.findLastEl(wordsData.getWords());
        System.out.println("Last element in the collection: " + lastEl);
    }
}
