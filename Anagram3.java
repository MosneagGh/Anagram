package Anagrams;

import java.util.*;

import static Anagrams.Afisare.*;

public class Anagram3 {
    public static HashMap<String, List<String>> anagrams = new HashMap<>();

    static void findAnagrams(String[] myWords) {
        for (String word : myWords) {
            String wordSort = sortare(word);
            List<String> values = anagrams.get(wordSort);
            if (values == null)
                values = new ArrayList<>();

            values.add(word);
            anagrams.put(wordSort, values);
        }
        afisare();
    }

   static String sortare(String Word) {

        char[] chars = Word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
