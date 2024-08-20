package Stack;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] intArray = new int[]{6, 9, 1, 2, 0, 5, 4};
        Stack<Integer> st = new Stack<Integer>();
        for(int i=intArray.length-1; i>=0; i--){
            while (!st.isEmpty() && st.peek() < intArray[i]){
                st.pop();
            }

            if (!st.isEmpty()){
                System.out.println(intArray[i] + " " + st.peek());
            }else {
                System.out.println(intArray[i] + " " + -1);
            }
            st.push(intArray[i]);
        }
    }
}
