package LinkedList.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LC0002 {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(2);
        headA.next = new ListNode(4);
        headA.next.next = new ListNode(3);
        
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(4);

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        int carry = 0;

        while(headA!=null || headB!=null || carry!=0){
            int sum = carry;

            if(headA != null){
                sum += headA.val;
                headA = headA.next;
            }

            if(headB != null){
                sum += headB.val;
                headB = headB.next;
            }

            int rem = sum % 10;
            carry = sum / 10;

            head.next = new ListNode(rem);
            head = head.next;
        }

        printList(dummy.next);
    }
}