package Hashing_Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Q1 {

    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int n = arr.length;
        int target = -2;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i=0; i<n; i++){
            hs.put(arr[i], i);
        }
        boolean flag = false;
        for (int i=0; i<n; i++){
            if (hs.containsKey(target-arr[i])){
                System.out.println(arr[i]+" "+(target-arr[i]));
                flag = true;
            }
        }
        if (flag == false)System.out.println("No");

        //Using hashset
//        int arr[] = {0, 10, 11, 6, 4, 5, 3, 2, 4, 6, 10};
//        int n = arr.length, target = 10;
//        boolean flag = false;
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i=0; i<n; i++){
//            if (hs.contains(target-arr[i])){
//                System.out.println(arr[i]+" "+(target-arr[i]));
//                flag=true;
//            }
//            hs.add(arr[i]);
//        }
//        if (flag==false)System.out.println("No");

    }
}
