package Algorithms.Searching;

import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args) {

        //Linear search - [Time complexity : O(n)]
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n1 = sc1.nextInt();
        int[] givenArray1 = new int[n1];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i <n1; i++){
            givenArray1[i] = sc1.nextInt();
        }
        System.out.print("Enter target element: ");
        int targetElement1 = sc1.nextInt();
        boolean flag1 = false;
        int i1 =0;
        for (; i1 < n1; i1++){
            if (givenArray1[i1] == targetElement1){
                flag1 = true;
                break;
            }
        }
        if (flag1 == false) System.out.println("The given target element is not present in the given array.");
        else System.out.println("The given target element is present in the given array at index " + i1);


        //Binary search - [Time complexity : O(log (n))]
        //The necessary condition here is that the array should be sorted.
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n2 = sc2.nextInt();
        int[] givenArray2 = new int[n2];
        System.out.print("Enter the array elements in sorted manner: ");
        for (int i = 0; i< n2; i++){
            givenArray2[i] = sc2.nextInt();
        }
        System.out.print("Enter target element: ");
        int targetElement2 = sc2.nextInt();
        boolean flag2 = false;
        int low = 0;
        int high = givenArray2.length-1;
        int mid = low + (high-low)/2;
        while (low<=high){
            mid = low + (high-low)/2;
            if (givenArray2[mid] == targetElement2){
                flag2 = true;
                break;
            } else if (givenArray2[mid] < targetElement2) {
                low = mid+1;
            }else high = mid-1;
        }
        if (flag2 == false) System.out.println("The given target element is not present in the given array.");
        else System.out.println("The given target element is present in the given array at index " + mid);

    }
}
