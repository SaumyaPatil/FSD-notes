import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        //Time complexity is represented in three ways - best represented by omega, average represented by theta, best case represented by big O notation.
        //We are concerned with worst time complexity.

        //How to find?
//        int x;              //O(1) since, the program will take same time everytime to run. When we take n as input from user, it will run for O(n) time.
//        x=10;
//        System.out.println(x);
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=0; i<n; i++){               //O(2n) -> O(n) Since, we ignore constant values and consider input values. When loops are nested then it will be n^2.
//            System.out.println(i);
//        }
//        for (int i=0; i<n; i++){
//            System.out.println(i);
//        }

//        int n=100;
//        for (int i=0; i<n; i*2){
//            System.out.print(i+" ");
//        }
        //Here, 2^0 + 2^1 + 2^2 + 2^3 + 2^4 + 2^5 + ... = k
        //2^(0+1+2+3+4+5+...) = k
        //2^n = k
        //   log 2^n = log k
        //   n = log k
        
    }
}
