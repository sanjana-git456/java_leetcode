
import java.util.*;

public class Parenthesis {

    public void paren(char[] x) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        boolean valid = true;
        for (int i = 0; i < x.length; i++) {
            if (!map.containsKey(x[i])) {
                stack.push(x[i]);
            } else if (map.containsKey(x[i]) && !stack.isEmpty() && stack.peek().equals(map.get(x[i]))) {
                stack.pop();
            } else {
                valid = false;
                break;
            }
        }
        if (stack.isEmpty() && valid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        char arr[] = "[({})]".toCharArray();
        p.paren(arr);
    }
}
