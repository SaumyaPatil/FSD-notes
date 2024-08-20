class PersonalDetails1{
    String name;
    int age;
    int password;
    int rollNo=67;
    PersonalDetails1(String name, int age, int password){
        this.name=name;
        this.age=age;
        this.password=password;
    }
}

class EmployeeDetails extends PersonalDetails1{
    int salary;
    String companyName;
    int rollNo = 78;
    EmployeeDetails(String name, int age, int password, int salary, String companyName){
        super(name, age, password);  //ye parent me bhejega inn sab variables ko
        this.salary=salary;
        this.companyName=companyName;
    }
    void printRollNo(){
        System.out.println(super.rollNo);
    }
}

//super is used to call the immediate parent or method

public class SingleInheritance {
    public static void main(String[] args) {
        EmployeeDetails obj1 = new EmployeeDetails("Saumya", 123, 86, 45000, "Upgrad");
        System.out.println(obj1.name+" "+ obj1.password+" "+ obj1.age+" "+ obj1.salary+" "+ obj1.companyName);
        obj1.printRollNo();
    }
}
