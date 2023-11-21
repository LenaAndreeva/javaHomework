package school.lesson9.Task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");

        String[] sortedArr = SortingCollection.sortAscending(collection);
        System.out.println("Sorted list: " + Arrays.toString(sortedArr));

    }
}
