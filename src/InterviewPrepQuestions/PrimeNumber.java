package InterviewPrepQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        if (num==1 || num==0) System.out.println("It is nor prime not composite.");
        else {
            for (int i=2; i<num/2; i++){
                if (num%i == 0){
                    System.out.println("The number is composite.");
                    flag=false;
                    break;
                }
            }
            if (flag==true) System.out.println("The number is prime.");
        }
    }
}
