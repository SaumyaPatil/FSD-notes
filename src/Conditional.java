import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        //Q1.
//        int a = 6;
//        int b = 28;
//        if(a>b) System.out.println(a + " is greater than " + b);
//        else System.out.println(a + " is smaller than " + b);

        //Q2.
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your age :- ");
//        int age = sc.nextInt();
//
//        if(age>18) System.out.println("The person is eligible to vote.");
//        else System.out.println("The person is not eligible to vote.");

        //Q3.
//        Scanner sc = new Scanner(System.in);
//        int firstNum = sc.nextInt();
//        int secNum = sc.nextInt();
//        int thirdNum = sc.nextInt();
//        if(firstNum>secNum && firstNum>thirdNum) System.out.println(firstNum);
//        else if (secNum>firstNum && secNum>thirdNum) System.out.println(secNum);
//        else System.out.println(thirdNum);

        //Q4.
//        Scanner sc = new Scanner(System.in);
//        float marks = sc.nextFloat();
//
//        if(marks>90 && marks<=100) System.out.println("A+");
//        else if (marks>80 && marks<=90) System.out.println("A");
//        else if (marks>70 && marks<=80) System.out.println("B+");
//        else if (marks>60 && marks<=70) System.out.println("B");
//        else if (marks>50 && marks<=60) System.out.println("C");
//        else System.out.println("Fail");

        //Q5.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your nationality:- ");
//        boolean nationality = sc.nextBoolean();
//
//        System.out.print("Enter your age:- ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter if you have voter ID:- ");
//        boolean voterID = sc.nextBoolean();
//
//        if(nationality == true){
//            if(age>18){
//                if(voterID == true) System.out.println("You are eligible to vote.");
//                else System.out.println("You are not eligible to vote since you don't have voterID.");
//            }
//            else System.out.println("You are below 18, hence not eligible to vote.");
//        }else System.out.println("You are not eligible to vote since you are not an Indian.");

        //Q6.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:- ");
        String email = sc.next();

        System.out.println("Enter password:- ");
        int password = sc.nextInt();

        if(email == "saupatil10dec@gmail.com" && password == 123) System.out.println("You are logged in.");
        else {
            if(email != "saupatil10dec@gmail.com") System.out.println("Your email is incorrect.");
            else System.out.println("Your password is incorrect.");
        }
    }
}
