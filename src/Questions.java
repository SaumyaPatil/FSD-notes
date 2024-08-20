import java.util.Scanner;

public class Questions {
    // Q1. Write a program to swap 2 numbers using function
    static int num1;
    static int num2;

    Questions(int numa,int numb){
        num1=numa;
        num2=numb;
    }

    static void SwappingTwoNumbers(){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    //Q2. Write a program to find the greatest of three numbers
    static int GreatestNumber(int num1, int num2, int num3){
        if(num1>num2 && num1>num3) return num1;
        else if (num2>num1 && num2>num3) return num2;
        else return num3;
    }

    //Q3. User's salary is:-
    static boolean UserSalary(int salary){     //parameters
        if(salary>=20000 && salary<=45000)return true;
        else return false;
    }

    public static void main(String[] args){
        //logical statements are executed inside a function - DRY
        //declare, define and call
        //Method always returns one value
        //The return type and the defined declaration type should be same
        //Try to print the data always in a void type method
        //Parameters are passed in method declaration and it is always of a type and is optional
        //Arguments are the values passed to a method while calling it

        Questions num=new Questions(30,40);

        SwappingTwoNumbers();        //arguments
        System.out.println(num1);
        System.out.println(num2);

//        System.out.println(GreatestNumber(30, 40, 50));

//        int salary = 46000;
//        System.out.println(UserSalary(salary));
    }
}
