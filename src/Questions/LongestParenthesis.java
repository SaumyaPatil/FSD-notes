package Questions;

import java.util.Stack;

public class LongestParenthesis {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestParenthesis solution = new LongestParenthesis();
        System.out.println("Longest valid parentheses length: " + solution.longestValidParentheses("(()"));
        System.out.println("Longest valid parentheses length: " + solution.longestValidParentheses(")()())"));
        System.out.println("Longest valid parentheses length: " + solution.longestValidParentheses("()(())"));
    }
}
