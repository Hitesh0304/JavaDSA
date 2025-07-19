package strings;

/*
Question - Implement an algo to determine if a string has all unique characters. What if you cannot use additional data structures?

Important questions to be asked:
- Is the String ASCII or Unicode?
 */

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) {
        String first = "Hitesh";
        String last = "Moudgil";

        System.out.printf("String - \"%s\" has all unique characters: %s%n", first, isUniqueString(first));
        System.out.printf("String - \"%s\" has all unique characters: %s%n", last, isUniqueString(last));

        //using boolean array method
        System.out.printf("String - \"%s\" has all unique characters: %s%n", first, isUniqueStringUsingBooleanArray(first));
        System.out.printf("String - \"%s\" has all unique characters: %s%n", last, isUniqueStringUsingBooleanArray(last));
    }

    public static boolean isUniqueString(String str) {
        //Using brute force - time complexity is O(n^2), space is O(n)
//        for(int i = 0; i < str.length(); i++) {
//            for(int j = i+1; j < str.length(); j++) {
//                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;

        //Using Set - time complexity O(n), space - O(n)
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!characterSet.contains(str.toLowerCase().charAt(i))) {
                characterSet.add(str.toLowerCase().charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    //Using boolean array
    //we assume that string is ASCII
    //time complexity - O(n), space - O(1)
    public static boolean isUniqueStringUsingBooleanArray(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}
