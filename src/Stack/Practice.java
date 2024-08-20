package Stack;

import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= 10; i++) {
            st.push(i);
        }

        System.out.println("Original stack: " + st);
        System.out.println("Popping odd integers: " + st);

        while (!st.isEmpty()) {
            int top = st.peek();
            if (top % 2 != 0) {
                System.out.println("Popped: " + st.pop());
            } else {
                st.pop();
            }
        }
    }
}
