class PersonalDetails{
    String name;

    //    this attribute is not accessible outside this class - private here is access modifier
    //    private int password;
    int age;

    PersonalDetails(String name, int password, int age){
        this.name = name;
//        this.password = password;
        this.age = age;
    }

    void showData(){
//        System.out.println(name+" "+password+" "+age);
    }

    void setAge(int age1){
        if (age1>=0 && age1<=120){
            age=age1;
        }else {
            age=-1;
        }
    }

    void getAge(){
        if (age!=-1) System.out.println(age);
        else System.out.println("Invalid Age");
    }
}

public class Encapsulation {
    //Security and control over data
    private String collegeName="St. Aloysius";

    public static void main(String[] args){
        PersonalDetails obj = new PersonalDetails("Saumya", 123, 21);
//        System.out.println(obj.name);
//        System.out.println(obj.password);

        obj.setAge(120);
        obj.getAge();

//        Encapsulation obj1 = new Encapsulation();
//        System.out.println(obj1.collegeName);
    }
}
