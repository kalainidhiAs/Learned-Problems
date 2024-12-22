package zoho;

import java.util.Stack;

public class mathematicalExpression {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                // If the previous character was also a letter or digit, return false
                if (i > 0 && Character.isLetterOrDigit(s.charAt(i - 1))) {
                    return false;
                }
            } else if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // No matching opening symbol
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Mismatched opening symbol
                }
            }
        }

        return stack.isEmpty(); // Check if all opening symbols are matched
    }

    public static void main(String[] args) {
        String s = "(a+b) (ab*)";
        System.out.println(isValid(s));
    }
}
