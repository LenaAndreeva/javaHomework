package school.lesson8.Task1;

import java.util.*;

public class WordProcessor {
    public void printUniqueWords(Set<String> uniqueWords) {
        System.out.println("Unique words: ");

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCountHm = new HashMap<>();

        for (String word : words) {
            if (wordCountHm.containsKey(word)) {
                wordCountHm.put(word, wordCountHm.get(word) + 1);
            } else {
                wordCountHm.put(word, 1);
            }
        }
        return wordCountHm;
    }

    public void printWordOccurrences(Map<String, Integer> wordCountHm) {
        System.out.println("\nNumber of occurrences of each word: ");

        for (Map.Entry<String, Integer> entry : wordCountHm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
