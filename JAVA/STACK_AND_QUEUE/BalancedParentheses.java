package JAVA.STACK_AND_QUEUE;

import java.util.*;;

public class BalancedParentheses {

    public static void main(String[] args) {
        String str = "{[()]}";

        System.out.println("is balanced >>>> " + isBalanced(str));
    }

    private static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((top != '{' && c == '}') ||
                        (top != '[' && c == ']') ||
                        (top != '(' && c == ')'))
                    return false;

            }
        }

        return stack.isEmpty();

    }

}
