
import java.util.*;

public class Parenthesis {

    public void par(char[] nums) {
        boolean valid = true;
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                stack.push(nums[i]);
            } else if (map.containsKey(nums[i]) && !stack.isEmpty() && stack.peek().equals(map.get(nums[i]))) {
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
        char[] test = {'(', ')', '[', ']'};
        Parenthesis p = new Parenthesis();
        p.par(test);
    }
}
