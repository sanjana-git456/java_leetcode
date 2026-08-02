
import java.util.*;

public class Queue {

    Stack<Integer> instack;
    Stack<Integer> outstack;

    public Queue() {
        instack = new Stack<>();
        outstack = new Stack<>();
    }

    public void push(int x) {
        instack.push(x);
    }

    public int pop() {
        if (outstack.isEmpty()) {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }
        return outstack.pop();
    }

    public int peek() {
        if (outstack.isEmpty()) {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }
        return outstack.peek();
    }

    public boolean empty() {
        return instack.isEmpty() && outstack.isEmpty();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());    // should print 1 (fifo)
        System.out.println(q.peek());   // should print 2
        System.out.println(q.empty());  // should print false
    }
}
