public class Swap {
    public static void main(String[] args){
        //Write a program to swap two numbers
        //Solution 1
//        int a = 5;
//        int b = 6;
//
//        int c = a;
//        a=b;
//        b=c;
//
//        System.out.print(a + " " + b);

        //Solution 2
        int a = 51;
        int b = 61;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
