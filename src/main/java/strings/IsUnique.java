package strings;

/*
Question - Implement an algo to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) {
        String first = "Hitesh";
        String last = "Moudgil";

        System.out.printf("String - \"%s\" has all unique characters: %s%n", first, isUniqueString(first));
        System.out.printf("String - \"%s\" has all unique characters: %s ", last, isUniqueString(last));
    }

    public static boolean isUniqueString(String str) {

        //time complexity is O(n^2)
//        for(int i = 0; i < str.length(); i++) {
//            for(int j = i+1; j < str.length(); j++) {
//                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;

        //Using Set - time complexity O(n)
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
}
