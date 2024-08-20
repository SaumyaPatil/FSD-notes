package Hashing_Questions;

import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();

        int arr1[] = {1, 2, 5, 4, 0};
        int arr2[] = {2, 4, 5, 0, 1};
        for (int i=0; i<arr1.length; i++){
            if (mp1.containsKey(arr1[i])){
                int freq = mp1.get(arr1[i]);
                freq++;
                mp1.put(arr1[i], freq);
            }
            else mp1.put(arr1[i], 1);
        }
//        System.out.println(mp1);

        for (int i=0; i<arr2.length; i++){
            if (mp2.containsKey(arr2[i])){
                int freq = mp2.get(arr2[i]);
                freq++;
                mp2.put(arr2[i], freq);
            }
            else mp2.put(arr2[i], 1);
        }
//        System.out.println(mp2);

//        if (mp1 == mp2) System.out.println("True");
//        else System.out.println("False");
        boolean flag=true;
        for (Integer pt: mp1.keySet()){
            if (mp1.get(pt) != mp2.get(pt)) {
                System.out.println("False");
                flag = true;
                break;
            }
        }
        if (flag==false) System.out.println("True");
    }
}
