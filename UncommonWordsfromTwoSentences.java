import java.util.*;
import java.util.stream.Stream;

public class UncommonWordsfromTwoSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Split both sentences into words and count their occurrences
        for (String word : s1.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        for (String word : s2.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Collect words that occur exactly once
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        // Convert list to array
        return result.toArray(new String[0]);
    }
    
    public static void main(String[] args) {
        Stream<String> stream = Arrays.stream(uncommonFromSentences("this apple is sweet", "this apple is sour"));
        stream.forEach(str -> System.out.print(str + " "));
    }
}
