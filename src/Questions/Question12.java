package Questions;

import java.util.Stack;

public class Question12 {
    public boolean areExpressionsSimilar(String s1, String s2) {
        return simplifyExpression(s1).equals(simplifyExpression(s2));
    }

    private String simplifyExpression(String s) {
        Stack<Integer> signStack = new Stack<>();
        signStack.push(1);  // Initial sign is positive
        StringBuilder sb = new StringBuilder();
        int sign = 1;  // Current sign (1 for positive, -1 for negative)

        for (char ch : s.toCharArray()) {
            if (ch == '+') {
                sign *= signStack.peek();  // Apply current sign
            } else if (ch == '-') {
                sign *= -signStack.peek();  // Apply negative of current sign
            } else if (ch == '(') {
                // Push current sign onto stack and reset sign
                signStack.push(sign);
                sign = 1;
            } else if (ch == ')') {
                // Pop from stack to restore previous sign
                signStack.pop();
            } else {
                // Append the character with the current sign
                sb.append((char) (sign * (ch - 'a') + 'a'));  // Convert back to character
                sign = 1;  // Reset sign after processing a character
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Question12 solution = new Question12();

        String expr1 = "(a+b)-(c-d)";
        String expr2 = "a+b-c+d";

        System.out.println("Are expressions similar? " + solution.areExpressionsSimilar(expr1, expr2));  // Output: true
    }
}
