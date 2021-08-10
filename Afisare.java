package Anagrams;

import java.util.List;
import static Anagrams.Anagram3.*;
public class Afisare {
     static void afisare() {
        anagrams.forEach((String key, List<String> value) -> {
            if (value.size() == 1) {
                return;
            } else System.out.println(value.toString()
                    .replace('[', ' ').replace(']', ' '));
        });
     }
}
