package Anagrams;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static Anagrams.Anagram3.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(new File("anagrams1.txt"));
        ArrayList<String> lists = new ArrayList<>();
        while (s.hasNext()) {
            lists.add(s.next());
        }
        s.close();

        String[] array = new String[lists.size()];
        array = lists.toArray(array);
        findAnagrams(array);
    }
}
