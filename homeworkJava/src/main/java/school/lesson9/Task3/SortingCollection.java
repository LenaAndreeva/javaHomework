package school.lesson9.Task3;
import java.util.*;
public class SortingCollection {

    public static String[] sortAscending(List<String> elements) {
        return elements.stream()
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1))))
                .toArray(String[]::new);
    }
}
