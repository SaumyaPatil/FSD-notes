package Algorithms.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingAnElement {

    public static void linearSearch(int n, int[] givenArray, int targetElement){

        //Time complexity : O(n)
        boolean flag = false;
        int i = 0;
        for (; i < n; i++){
            if (givenArray[i] == targetElement){
                flag = true;
                break;
            }
        }
        if (flag == false) System.out.println("The given target element is not present in the given array.");
        else System.out.println("The given target element is present in the given array at index " + i);

    }


    public static void binarySearch(int[] givenArray, int targetElement){

        Arrays.sort(givenArray);

        //The necessary condition here is that the array should be sorted.
        int low = 0;
        int high = givenArray.length-1;
        int mid = low + (high-low)/2;
        boolean flag = false;

        //Time complexity : O(log (n))
        while (low<=high){
            mid = low + (high-low)/2;
            if (givenArray[mid] == targetElement){
                flag = true;
                break;
            } else if (givenArray[mid] < targetElement) {
                low = mid+1;
            }else high = mid-1;
        }
        if (flag == false) System.out.println("The given target element is not present in the given array.");
        else System.out.println("The given target element is present in the given array at index " + mid);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] givenArray = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i< n; i++){
            givenArray[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int targetElement = sc.nextInt();

        //Searching element using linear search
        linearSearch(n, givenArray, targetElement);

        //Searching element using binary search
        binarySearch(givenArray, targetElement);

    }
}
