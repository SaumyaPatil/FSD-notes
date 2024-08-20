public class StudentsData{
    String name;
    String courses;
    float fees;
    int batch;

    //Constructor
    StudentsData(String name, String courses, float fees, int batch){
        //whenever the constructor parameter is same as attribute name, then give this to attributes
        this.name=name;
        this.courses=courses;
        this.fees=fees;
        this.batch=batch;
    }

    void PrintName(){
        System.out.println(name);
    }

    void PrintCourse(){
        System.out.println(courses);
    }

    void PrintFees(){
        System.out.println(fees);
    }

    void PrintBatch(){
        System.out.println(batch);
    }

    public static void main(String[] args){
        //Objects are real world entities
        StudentsData asObj = new StudentsData("Ashpak", "FSD", 85000.0f, 6);
        asObj.PrintName();
        asObj.PrintBatch();
        asObj.PrintCourse();
        asObj.PrintFees();

        StudentsData tnObj = new StudentsData("Tanushree", "FSD", 85000.0f, 6);
        tnObj.PrintName();
        tnObj.PrintBatch();
        tnObj.PrintCourse();
        tnObj.PrintFees();
    }
}
