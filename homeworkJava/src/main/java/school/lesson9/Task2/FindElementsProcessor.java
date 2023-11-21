package school.lesson9.Task2;
import java.util.*;
public class FindElementsProcessor {

    public static long countOfEl(List<String> words) {

        return words.stream()
                .filter("High"::equals)
                .count();
    }

    public static String findFirsEl(List<String> words) {
        return words.stream()
                .findFirst()
                .orElse("0");
    }

    public static String findLastEl(List<String> words) {
        return words.stream()
                .skip(words.size() - 1)
                .findFirst()
                .orElse("0");
    }

}
