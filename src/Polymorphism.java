//There are many forms to the method

class Student{
    String name = "Saumya Patil";
    void PrintName(){
        System.out.println(name);
    }
}

class NewStudent extends Student{
    String name = "Saumya";
    void PrintName(){
        System.out.println(super.name);
    }
}

class A{
    private int a=10;
}

//class B extends A{
//    void PrivateData(){
//        System.out.println(super.a);
//    }
//}

public class Polymorphism {
    //Method overloading - (compile time polymorphism) and method overriding are two types of polymorphism
    int Add(int a, int b){
        return a+b;
    }

    float Add(float a, float b){
        return a+b;
    }

    int Add(int a, int b, int c){
        return a+b+c;
    }

    int Add(int a, float b, int c){
        System.out.println(b);
        return a+c;
    }

    int Add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
//        Polymorphism obj = new Polymorphism();
//        obj.Add(20, 30);
//        obj.Add(34.4f, 45.3f);
//        obj.Add(20, 30, 40);
//        obj.Add(30, 34.54f, 40);
//        obj.Add(20, 30, 40, 50);
//        B obj = new B();
//        obj.PrivateData();
    }
}
