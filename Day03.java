import java.util.*;

public class Day03 {
    public int minLength(String s) {
        Stack<Character> sb = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (sb.isEmpty()) {
                sb.push(current);
                continue;
            }
            if (current == 'B' && sb.peek() == 'A') {
                sb.pop();
            } else if (current == 'D' && sb.peek() == 'C') {
                sb.pop();
            } else {
                sb.push(current);
            }

        }
        return sb.size();

    }

    public static void main(String[] args) {
        Day03 d = new Day03();
        System.out.println(d.minLength("ABCD"));
        System.out.println(d.minLength("ACBD"));
        System.out.println(d.minLength("ABCBBD"));
        System.out.println(d.minLength("ABCDACBD"));

    }
}