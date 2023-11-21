package school.lesson8.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayData arrayData= new ArrayData();
        WordProcessor wordProcessor = new WordProcessor();

        Map<String, Integer> wordCountMap = wordProcessor.countWords(arrayData.getFlowersArray());
        wordProcessor.printUniqueWords(wordCountMap.keySet());
        wordProcessor.printWordOccurrences(wordCountMap);
    }
}
