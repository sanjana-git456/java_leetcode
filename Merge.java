
public class Merge {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mer(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        }
        if (list2 != null) {
            curr.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Merge m = new Merge();
        Merge.ListNode a1 = m.new ListNode(1);
        Merge.ListNode a2 = m.new ListNode(2);
        Merge.ListNode a3 = m.new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        Merge.ListNode b1 = m.new ListNode(1);
        Merge.ListNode b2 = m.new ListNode(3);
        Merge.ListNode b3 = m.new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        ListNode result = m.mer(a1, b1);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
