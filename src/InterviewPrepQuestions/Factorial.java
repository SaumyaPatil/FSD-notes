package InterviewPrepQuestions;

import java.util.Scanner;

public class Factorial {

    int FactorialOfNumber(int num){
        if (num==1 || num==0)return 1;
        return num*FactorialOfNumber(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int ans=1;
//        for (int i=num; i>=1; i--){
//            ans = ans*i;
//        }
//        System.out.println(ans);
        Factorial obj = new Factorial();
        System.out.println(obj.FactorialOfNumber(num));
    }
}
