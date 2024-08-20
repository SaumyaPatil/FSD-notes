package InterviewPrepQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag=true;
        for (int i=0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Not a palindrome.");
                flag = false;
                break;
            }
        }
        if (flag == true) System.out.println("Is a palindrome.");
    }
}
