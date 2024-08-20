package Stack;
import java.util.Scanner;
import java.util.Stack;

public class SortingStack {

    public static void main(String[] args) {
        Stack<Integer> givenStack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        int input = sc.nextInt();

        givenStack.push(input);
        givenStack.push(input);
        givenStack.push(input);
        givenStack.push(input);
        givenStack.push(input);
        givenStack.push(input);
        givenStack.push(input);

        Stack<Integer> tempStack = new Stack<Integer>();
        while (!givenStack.isEmpty()){
            int x = givenStack.pop();
            if (tempStack.isEmpty() || x>=tempStack.peek()){
                tempStack.push(x);
                System.out.print(x + " ");

//                while (!tempStack.isEmpty()){
//                    System.out.print(tempStack.peek() + " ");
//                    tempStack.pop();
//                }
            }
            else {
                while (x<tempStack.peek() || !tempStack.isEmpty()){
                    if (x>=tempStack.peek()) break;
                    givenStack.push(tempStack.pop());
                }
                tempStack.push(x);
            }
        }
//        while (!tempStack.isEmpty()){
//            System.out.print(tempStack.pop());
//            System.out.print(" ");
//        }
//        System.out.println();
    }
}
