
public class Recursion {
    static void Func(int x){
        if (x==0) return;
        System.out.print(x + " ");
        Func(x-1);
    }


    static int Fact(int x){
        if (x==1)return 1;
        else return Fact(x-1)*x;
    }

    void fibonacci(int x, int a, int b){
        if (x==10)return;
        int num=a+b;
        System.out.print(num + " ");
        a=b;
        b=num;
        fibonacci(x+1, a, b);
    }

    public static void main(String[] args) {
        //Recursion notes -
        //1. When a function calls itself inside it, it's called recursion.
        //2. Recursion is used to solve complex question by dividing bigger problems into smaller problems.
        //3. Recursion uses stack
        //4. It takes more memory
        //5. Its approach is from top to down and again from down to top.

        //Q1. Write a program to print natural numbers from 100-1
//        Func(100);

        //Q2. Factorial of 5 using recursion
//        System.out.println(Fact(10));

        //Q3. Write a program to print fibonacci series
        //Iterative method
//        int a=0, b=1, num;
//        System.out.println(a);
//        System.out.println(b);
//        for (int i=2; i<=10; i++){
//            num=a+b;
//            System.out.println(num);
//            a=b;
//            b=num;
//        }

        //Recursive method
        Recursion obj=new Recursion();
        System.out.print(0);
        System.out.print(" ");
        System.out.print(1);
        System.out.print(" ");
        obj.fibonacci(1, 0, 1);
    }
}
