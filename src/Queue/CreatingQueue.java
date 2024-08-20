package Queue;

import java.util.*;

public class CreatingQueue {
    public static void main(String[] args) {
//        Queue<Integer> qe1 = new LinkedList<>();

//        //Q1. Implement a stack using a queue
//        //Q2. Sort a queue with the help of temporary stack
//        //Q3. Find middle element of a queue

        //Q1.
        //2 pointer approach
//        String str = "aebcbdda";
//        int count=0, i=0, j=str.length()-1;
//        while (i<j){
//            if (str.charAt(i) == str.charAt(j)){
//                i++;
//                j--;
//            }else{
//                if ((str.charAt(i) == str.charAt(j-1)) || (str.charAt(j) == str.charAt(i+1)))count++;
//                else count+=2;
//
//                if (str.charAt(i) == str.charAt(j-1))j--;
//                else if (str.charAt(j) == str.charAt(i+1))i++;
//                else {
//                    i++;
//                    j--;
//                }
//            }
//        }
//        System.out.println(count);

        //Approach 2.
//        String str = "aebcbdda";
//        String str1 = "", str2 = "";
//        for (int i=0; i<str.length()/2; i++){
//            str1 = str1 + str.charAt(i);
//        }
//
//        for (int i=(str.length()/2); i<str.length(); i++){
//            str2 = str2 + str.charAt(i);
//        }
//
//

        //Q2.
//        Set<Character> hash_Set_1 = new HashSet<Character>();
//        Set<Character> hash_Set_2 = new HashSet<Character>();
//
//        String str1 = "aab";
//        String str2 = "xyz";
//        int i=0;
//        if (str1.length() != str2.length()) System.out.println("False");
//        else {
//            while (i<str1.length()){
//                hash_Set_1.add(str1.charAt(i));
//                i++;
//            }
//
//            i=0;
//            while (i<str2.length()){
//                hash_Set_2.add(str2.charAt(i));
//                i++;
//            }
//            if (hash_Set_1.size() == hash_Set_2.size()) System.out.println("True");
//            else System.out.println("False");
//        }

        //Q3.
//        Set<String> subSeq = new HashSet<String>();
//        String str = "gfg";
//        for (int i=0; i<str.length(); i++){
//            for (int j=i+1; j<str.length(); j++){
//                subSeq.add(str.charAt(i));
//            }
//        }
    }
}
