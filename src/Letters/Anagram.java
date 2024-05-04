package Letters;

import java.util.*;

public class Anagram {
    public static Map<String, List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {

            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);


            if (!anagramGroups.containsKey(sortedWord)) {

                anagramGroups.put(sortedWord, new ArrayList<>());
            }

            anagramGroups.get(sortedWord).add(word);
        }

        return anagramGroups;
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagramGroups = groupAnagrams(words);


        for (Map.Entry<String, List<String>> entry : anagramGroups.entrySet()) {
            System.out.println("Anagrams of " + entry.getKey() + ": " + entry.getValue() + ", Count: " + entry.getValue().size());
        }
    }

}
