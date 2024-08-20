package Hashing_Questions;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 20, 10};
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        //TC:O(N), SC:O(N)
        for (int i=0; i<n; i++){
            if (mp.containsKey(arr[i])){
//                int freq = mp.get(arr[i]);
//                freq++;
//                mp.put(arr[i], freq);
                mp.get(arr[i]++);
            }else mp.put(arr[i], 1);
        }

        int maxi=0, num=0;
        for (Integer pt: mp.keySet()){
            if(mp.get(pt)>maxi){
                maxi = mp.get(pt);
                num = pt;
            }
        }
        System.out.println(num);
    }
}
