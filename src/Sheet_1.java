import java.util.Scanner;

public class Sheet_1 {
    public static void main(String[] args){
        //Q1. D
        //Q2. B
        //Q3. B
        //Q4. B
        //Q5. D


        //Q6.
//        Scanner sc = new Scanner(System.in);
//        String qualification = sc.next();
//        int experience = sc.nextInt();
//        if(qualification == "B.Tech" && experience == 1) System.out.println("You can apply for the job.");
//        else System.out.println("Am sorry!, you cannot apply for the job here.");


        //Q7.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter temperature in degree celcius.");
//        int temp = sc.nextInt();
//        if (temp<10) System.out.println("I recommend skiing.");
//        else if (temp>10 && temp<=20) System.out.println("I recommend hiking.");
//        else if (temp>20 && temp<=30) System.out.println("I recommend cycling.");
//        else if (temp>30) System.out.println("I recommend swimming.");

        //Q8.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your test scores.");
//        int scores = sc.nextInt();
//        if(scores>=90 && scores<=100) System.out.println("A");
//        else if (scores>=80 && scores<90) System.out.println("B");
//        else if (scores>=70 && scores<80) System.out.println("C");
//        else if (scores>=60 && scores<70) System.out.println("D");
//        else if (scores<60)

        //Q9.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Starter : $5.00");
//        System.out.println("Main Course : $10.00");
//        System.out.println("Dessert : $4.50");
//        System.out.println("Drinks : $2.50");
//
//        System.out.println("Enter the bill amount");
//        float totalBill = sc.nextFloat();
//
//        System.out.println("Have you taken main course");
//        boolean mainCourse = sc.nextBoolean();
//
//        System.out.println("Have you taken dessert");
//        boolean dessert = sc.nextBoolean();
//        if(totalBill > 50)

        //Q10.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the return date of the book :- ");
        int returnedDate = sc.nextInt();
        int delayDate = returnedDate-7;

        if(returnedDate>0 && returnedDate<=22) System.out.println(delayDate*1);
        else System.out.println(delayDate*2);


    }
}
