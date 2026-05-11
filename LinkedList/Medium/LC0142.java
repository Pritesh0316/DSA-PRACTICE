package LinkedList.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LC0142 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);

        head.next.next.next.next = head.next;

        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                isCycle = true;
                break;
            }
        }

        if(!isCycle){
            System.out.println("null");
            return;
        }

        slow = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.val);
    }
}