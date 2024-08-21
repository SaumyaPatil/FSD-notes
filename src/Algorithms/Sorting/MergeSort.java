package Algorithms.Sorting;

import java.util.Scanner;

public class MergeSort {

    public static int[] merge(int[] givenArray, int l, int mid, int r){
        int[] ansArray = new int[(r-l)+1];
        int[] array1 = new int[(mid-l)+1];
        int[] array2 = new int[(r-mid-1)+1];
        int k=0;
        for (int i=0; i<array1.length; i++){
            array1[i] = givenArray[k++];
        }

        for (int i=0; i<array2.length; i++){
            array2[i] = givenArray[k++];
        }
        k=0;
        int first=0, second=0;
        while (first<array1.length && second<array2.length){
            if (array1[first]<array2[second]){
                ansArray[k++] = array1[first];
                first++;
            }else {
                ansArray[k++] = array2[second];
                second++;
            }
        }

        while (first<array1.length){
            ansArray[k++] = array1[first];
            first++;
        }
        while (second<array2.length){
            ansArray[k++] = array2[second];
            second++;
        }
        return ansArray;
    }

    public static int[] mergeSort(int[] givenArray, int l, int r){
        if (l<r){
            int mid = l+(r-l)/2;

            mergeSort(givenArray, l, mid);
            mergeSort(givenArray, mid+1, r);

            //Merging the two halves
            return merge(givenArray, l, mid, r);
        }
        return givenArray;
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

        int[] ansArray = mergeSort(givenArray, 0, givenArray.length-1);

        for (int i=0; i<n; i++){
            System.out.print(ansArray[i] + " ");
        }
        System.out.println();
    }
}
