package Questions;

public class SortedRows {
    public static int countSortedRows(int[][] mat) {
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            if (isIncreasing(mat[i]) || isDecreasing(mat[i])) {
                count++;
            }
        }

        return count;
    }

    private static boolean isIncreasing(int[] row) {
        for (int i = 1; i < row.length; i++) {
            if (row[i] <= row[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDecreasing(int[] row) {
        for (int i = 1; i < row.length; i++) {
            if (row[i] >= row[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 5},
                {4, 3, 1, 2, 6},
                {8, 7, 6, 5, 4},
                {5, 7, 8, 9, 10}
        };

        System.out.println("Number of sorted rows: " + countSortedRows(mat)); // Output: 2
    }
}

