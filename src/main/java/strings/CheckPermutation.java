package strings;

/*
Ques - Given two strings, write a method to decide if one is a permutation of the other.

Things to consider:
- both strings have the same characters
- each character has same frequency
-
 */

import java.util.HashMap;

public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "ball";
        String str2 = "labl";
        System.out.println(isPermutation(str1, str2));
    }

    private static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char current = str1.charAt(i);
            charMap.put(current, charMap.getOrDefault(current, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char current = str2.charAt(i);
            if (charMap.containsKey(current) && charMap.get(current) > 0) {
                charMap.put(current, charMap.get(current) - 1);
            } else return false;
        }

        return true;
    }
}
