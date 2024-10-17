package String;

import java.util.*;

public class BalParanthesis {
    Stack<String> stack = new Stack<String>();

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                String top = stack.peek();
                if (s.charAt(i) == ')' && top.equals("(") || s.charAt(i) == '}' && top.equals("{")
                        || s.charAt(i) == ']' && top.equals("[")) {
                    stack.pop();
                    return true;
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalParanthesis b = new BalParanthesis();
        System.out.println(b.isValid("()"));
        System.out.println(b.isValid("()[]{}"));
        System.out.println(b.isValid("(]"));
        System.out.println(b.isValid("([)]"));
        System.out.println(b.isValid("([])"));
    }

}
