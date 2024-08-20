import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        switch (days){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:                              //It only looks for entry point and doesn't check below cases
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;                              //This is important since once it gets entry point it executes all the statements mentioned below.

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
