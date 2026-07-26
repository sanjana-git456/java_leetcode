
import java.util.*;

public class Minimum {

    Stack<Integer> stack;
    Stack<Integer> minstack;

    public Minimum() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty()) {
            minstack.push(val);
        } else {
            minstack.push(Math.min(val, minstack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return minstack.peek();
    }

    public int getMin() {
        return stack.peek();
    }

    public static void main(String[] args) {
        Minimum mi = new Minimum();
        mi.push(-2);
        mi.push(0);
        mi.push(-3);
        System.out.println(mi.getMin());  // should print -3
        mi.pop();
        System.out.println(mi.top());     // should print 0
        System.out.println(mi.getMin());  // should print -2
    }
}
