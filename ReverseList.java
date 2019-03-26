public class ReverseList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null) {
            return head;
        }
        ListNode last = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = last;
            last = head;
            head = temp;
        }
        head = last;
        return head;
    }
}
