
class PersonalDetails2{
    String name;
    int password;
    int age;
}

class CompanyOffer1 extends PersonalDetails2{
    String companyName1;
    int salary=90000;
}

class NewCompanyOffer1 extends CompanyOffer1{
    int updatedSalary;
}

class CompanyOffer2 extends PersonalDetails2{
    String companyName2;
    int salary=80000;
}

public class HirarcialInheritance {
    public static void main(String[] args) {
        //Java doesn't support multiple inheritance but we can support due to abstraction.
        NewCompanyOffer1 obj1 = new NewCompanyOffer1();
        obj1.name="Vikash";
        obj1.companyName1="TCS";
        obj1.updatedSalary=900000000;

        CompanyOffer2 obj2 = new CompanyOffer2();
        obj2.name="Dinesh";
        obj2.companyName2="Wipro";

        System.out.println(obj1.name+" "+ obj1.updatedSalary);
        System.out.println(obj2.name+" "+ obj2.password+" "+ obj2.age);
    }
}
