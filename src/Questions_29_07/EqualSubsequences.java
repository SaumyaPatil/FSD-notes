package Questions_29_07;

import java.util.HashSet;
import java.util.Set;

public class EqualSubsequences {

    public static String hasEqualSubsequences(String str) {
        Set<Character> seenCharacters = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seenCharacters.contains(c)) {
                return "YES";
            }
            seenCharacters.add(c);
        }

        return "NO";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasEqualSubsequences("geeksforgeeks")); // Output: YES
        System.out.println(hasEqualSubsequences("bhuvan"));        // Output: NO
    }
}
