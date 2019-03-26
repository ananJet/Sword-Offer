import java.util.ArrayList;

public class PrintListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode createList(int[] nums) {
        if (nums.length == 0)
            return null;
        ListNode head = new ListNode(nums[0]);
        ListNode temp = head;
        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        return head;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null)
            return res;
        if (listNode.next == null) {
            res.add(listNode.val);
            return res;
        }
        ListNode head = listNode;
        ListNode last = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = last;
            last = head;
            head = temp;
        }
        head = last;
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        PrintListFromTailToHead printListFromTailToHead = new PrintListFromTailToHead();
        ListNode head = printListFromTailToHead.createList(new int[]{1, 2, 3, 4});
        System.out.println(printListFromTailToHead.printListFromTailToHead(head));

    }
}
