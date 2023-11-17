package school.lesson8.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] flowersArray = {
                "chamomile", "lily", "rose", "orchid", "sunflower",
                "lily", "rose", "daisy", "chamomile", "rose",
                "daisy", "orchid", "sunflower", "lily", "daisy"
        };

        WordProcessor wordProcessor = new WordProcessor();

        Map<String, Integer> wordCountMap = wordProcessor.countWords(flowersArray);
        wordProcessor.printUniqueWords(wordCountMap.keySet());
        wordProcessor.printWordOccurrences(wordCountMap);
    }
}
