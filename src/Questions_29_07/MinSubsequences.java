package Questions_29_07;

import java.util.*;

public class MinSubsequences {

    public static int minSubsequences(String A, String B) {
        Map<Character, List<Integer>> charIndexMap = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (!charIndexMap.containsKey(c)) {
                charIndexMap.put(c, new ArrayList<>());
            }
            charIndexMap.get(c).add(i);
        }

        int count = 1;
        int lastIndex = -1;

        for (char c : B.toCharArray()) {
            if (!charIndexMap.containsKey(c)) {
                return -1;
            }

            List<Integer> indices = charIndexMap.get(c);
            int nextIndex = findNextIndex(indices, lastIndex);
            if (nextIndex == -1) {
                count++;
                lastIndex = indices.get(0);
            } else {
                lastIndex = indices.get(nextIndex);
            }
        }

        return count;
    }

    private static int findNextIndex(List<Integer> indices, int lastIndex) {
        int low = 0, high = indices.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (indices.get(mid) > lastIndex) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low < indices.size() ? low : -1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(minSubsequences("abbace", "acebbaae")); // 3
        System.out.println(minSubsequences("abc", "cbacbacba"));  //  7
    }
}
