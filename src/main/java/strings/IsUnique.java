package strings;

/*
Question - Implement an algo to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

public class IsUnique {
    public static void main (String[] args) {
        String string = "Hitesh";
        System.out.println("String has all unique characters: " + isUniqueString(string));
    }

    public static boolean isUniqueString(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j < str.length(); j++) {
                if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
