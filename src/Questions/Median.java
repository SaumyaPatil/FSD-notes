package Questions;

public class Median {
    public int findMedian(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Define the range for binary search
        int min = matrix[0][0];
        int max = matrix[r - 1][c - 1];

        // Binary search for the median value
        while (min < max) {
            int mid = min + (max - min) / 2;

            // Count elements less than or equal to mid
            if (countLessEqual(matrix, mid) <= (r * c) / 2) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        // min should be equal to max, which is the median
        return min - 1;
    }

    private int countLessEqual(int[][] matrix, int x) {
        int r = matrix.length;
        int c = matrix[0].length;
        int count = 0;
        int row = 0;
        int col = c - 1;

        // Traverse matrix to count elements less than or equal to x
        while (row < r && col >= 0) {
            if (matrix[row][col] <= x) {
                count += (col + 1);
                row++;
            } else {
                col--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Median solution = new Median();

        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        System.out.println("Median: " + solution.findMedian(matrix)); // Output: 9
    }
}
