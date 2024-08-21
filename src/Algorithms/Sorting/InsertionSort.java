package Algorithms.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] givenArray, int n){

        for (int i=1; i<n; i++){
            int temp = givenArray[i];
            int j=i-1;
            for (; j>=0; j--){
                if (givenArray[j]>temp)givenArray[j+1] = givenArray[j];
                else break;
            }
            givenArray[j+1] = temp;
        }

    }

    public static void printArray(int[] givenArray, int n){

        System.out.print("The sorted array is: ");
        for (int i = 0; i <n; i++){
            System.out.print(givenArray[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] givenArray = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++){
            givenArray[i] = sc.nextInt();
        }

        insertionSort(givenArray, n);

        printArray(givenArray, n);
    }
}
