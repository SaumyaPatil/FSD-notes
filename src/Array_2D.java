public class Array_2D {
    public static void main(String[] args) {
        //Advantages and disadvantages of arrays -
        //Searching or random access is easy. O(1)
        //Insertion/deletion is costly - O(n)
        int arr[][] = new int[3][4];
        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[0].length; col++){
                arr[row][col] = row+col;
            }
        }
        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[0].length; col++){
                System.out.print(arr[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int row_start=0, col_start=0, row_end=arr.length-1, col_end=arr[0].length-1;
        while(row_start<row_end && col_start<col_end){
            for (int i=0; i<col_end; i++){
                System.out.print(arr[row_start][i] + " ");
            }
            row_start++;
            for (int i=col_end-1; i>=0; i--){
                System.out.print(arr[row_start][i] + " ");
            }
            row_start++;
        }

        //even = seedha print karao and odd = ulta karao
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
//                if (i==0 || i==arr.length-1 || j=0 || j==arr[0].length) System.out.print(arr[i][j] + " ");
            }
        }
    }
}
