package LinkedList.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LC0328 {
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next = new ListNode(4);

        if(head==null || head.next==null){
            return;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenest = even;

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenest;

        printList(head);
    }
}