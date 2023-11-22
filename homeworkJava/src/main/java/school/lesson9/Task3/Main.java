package school.lesson9.Task3;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        CollectionData collectionData = new CollectionData();

        String[] sortedArr = SortingCollection.sortAscending(collectionData.getCollection());
        System.out.println("Sorted list: " + Arrays.toString(sortedArr));

    }
}
