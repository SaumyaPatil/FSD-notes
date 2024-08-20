package Algorithms.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] givenArray = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++){
            givenArray[i] = sc.nextInt();
        }

        //Sorting through selection sort
        for (int i=0; i<n-1; i++){
            int min=i;
            for (int j=i+1; j<n; j++){
                if (givenArray[min]>givenArray[j]) min=j;
            }
            int temp = givenArray[i];
            givenArray[i] = givenArray[min];
            givenArray[min] = temp;
        }

        System.out.print("The sorted array is: ");
        for (int i = 0; i <n; i++){
            System.out.print(givenArray[i] + " ");
        }
        System.out.println();
    }
}
