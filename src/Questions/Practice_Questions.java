package Questions;

import Linkedlists.LinkedNode;

import java.util.HashSet;
import java.util.Set;

public class Practice_Questions {
    public static void main(String[] args) {
        //Q1. Two pointer approach
//        String str = "aebcbda";
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

        //Solution 2.
//        String str = "aebcbdea";
//        int count = 0;
//        if (str.length()%2 != 0){    //odd
//            String str1 = "";
//            int i=0;
//            while (i < (str.length()/2)){
//                str1 = str1+str.charAt(i);
//                i++;
//            }
//            i=str.length()-1;
//            String str2 = "";
//            while (i >= (str.length()-(str.length()/2))){
//                str2 = str2+str.charAt(i);
//                i--;
//            }
//            i=0;
//            int j = 0;
//            while (i<str1.length() && j<str2.length()){
//                if (str1.charAt(i)!=str2.charAt(j))count++;
//                i++;
//                j++;
//            }
//            count++;
//            System.out.println(count);
//        }else{         //even
//            int i=0, j=str.length()-1;
//            while (i<j){
//                if (str.charAt(i)!=str.charAt(j)){
//                    if (str.charAt(i+1)==str.charAt(j)){
//                        count++;
//                        i++;
//                    }
//                    else if (str.charAt(j-1)==str.charAt(i)){
//                        count++;
//                        j--;
//                    }
//                    else count+=2;
//                }
//                i++;
//                j--;
//            }
//            System.out.println(count);
//        }

        //Q2.
//        Set<Character> hash_Set_1 = new HashSet<>();
//        Set<Character> hash_Set_2 = new HashSet<>();
//
//        String str1 = "aab";
//        String str2 = "xxz";
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

//        Q3.
//        Set<String> subSeq = new HashSet<String>();
//        subSeq.add("");
//        String str = "ggg";
//        for (int i=0; i<str.length(); i++){
//            for (int j=i; j<str.length(); j++){
//                String ans = "";
//                for (int k=i; k<=j; k++){
//                    ans = ans+str.charAt(k);
//                }
//                subSeq.add(ans);
//            }
//        }
//        System.out.println(subSeq.size());

        //Q4.
//        LinkedNode head;
//
//        Practice_Questions(){
//            head=null;
//        }
//
//        void insertAtTheEnd(int data){
//            Linkedlists.LinkedNode newNode=new Linkedlists.LinkedNode(data);
//            if (head==null){
//                head=newNode;
//                return;
//            }
//            Linkedlists.LinkedNode last=head;
//            while (last.next!=null){
//                last=last.next;
//            }
//            last.next=newNode;
//        }
//
//        void printData(){
//            LinkedNode last=head;
//            while (last!=null){
//                System.out.println(last.data);
//                last=last.next;
//            }
//        }
    }
}
