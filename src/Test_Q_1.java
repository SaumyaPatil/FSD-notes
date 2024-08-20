import java.util.*;

public class Test_Q_1 {
    public static int[] movingMedian(int[] arr) {
        int n = arr[0]; // window size
        int[] result = new int[arr.length - 1]; // Array to store the medians

        // Iterate through each element in the array
        for (int i = 1; i < arr.length; i++) {
            // Create a list to store the current sliding window
            List<Integer> window = new ArrayList<>();

            // Populate the window with the last N elements
            for (int j = Math.max(1, i - n + 1); j <= i; j++) {
                window.add(arr[j]);
            }

            // Sort the window to find the median
            Collections.sort(window);

            // Find the median
            int size = window.size();
            int median;
            if (size % 2 == 0) {
                // Even number of elements, take the average of the two middle elements
                median = (window.get(size / 2 - 1) + window.get(size / 2)) / 2;
            } else {
                // Odd number of elements, take the middle element
                median = window.get(size / 2);
            }

            // Store the median in the result array
            result[i - 1] = median;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] arr1 = {5, 2, 4, 6};
        int[] arr2 = {3, 0, 0, -2, 0, 2, 0, -2};

        // Print the output for arr1
        int[] output1 = movingMedian(arr1);
        System.out.println(Arrays.toString(output1)); // Output: [2, 3, 4]

        // Print the output for arr2
        int[] output2 = movingMedian(arr2);
        System.out.println(Arrays.toString(output2)); // Output: [0, 0, 0, 0, 0, 0, 0]
    }
}
