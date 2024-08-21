package Algorithms.Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] givenArray, int n){

        //Bubble sort algorithm performs stable sorting in O(n^2)
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (givenArray[j]>givenArray[j+1]){
                    int temp = givenArray[j];
                    givenArray[j] = givenArray[j+1];
                    givenArray[j+1] = temp;
                }
            }
        }

    }

    public static void printArray(int[] givenArray, int n){
        System.out.print("The sorted array is: ");
        for (int i=0; i<n; i++){
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

        bubbleSort(givenArray, n);

        printArray(givenArray, n);

    }
}
