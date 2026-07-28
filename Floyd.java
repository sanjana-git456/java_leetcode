
public class Floyd {

    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean cycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Floyd f = new Floyd();
        // 1 -> 2 -> 3 -> back to 1
        Floyd.ListNode n1 = f.new ListNode(1);
        Floyd.ListNode n2 = f.new ListNode(2);
        Floyd.ListNode n3 = f.new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        System.out.println(f.cycle(n1));

        // 1 -> 2 -> 3 -> null
        Floyd.ListNode m1 = f.new ListNode(1);
        Floyd.ListNode m2 = f.new ListNode(2);
        Floyd.ListNode m3 = f.new ListNode(3);
        m1.next = m2;
        m2.next = m3;
        System.out.println(f.cycle(m1));
    }
}
