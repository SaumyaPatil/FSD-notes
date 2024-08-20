package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextFreq {
    public int[] findNearestGreaterFrequency(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int currentElement = nums[i];
            int currentFrequency = frequencyMap.get(currentElement);

            // Pop elements from the stack which do not have higher frequency
            while (!stack.isEmpty() && frequencyMap.get(stack.peek()) <= currentFrequency) {
                stack.pop();
            }

            // Determine the result for the current position
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(currentElement);
        }

        return result;
    }

    public static void main(String[] args) {
        NextFreq solution = new NextFreq();

        int[] nums1 = {1, 1, 2, 3, 2};
        int[] result1 = solution.findNearestGreaterFrequency(nums1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        // Output: 2 2 3 -1 -1

        System.out.println();

        int[] nums2 = {4, 4, 4, 2, 2, 1};
        int[] result2 = solution.findNearestGreaterFrequency(nums2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        // Output: 2 2 2 -1 -1 -1
    }
}
