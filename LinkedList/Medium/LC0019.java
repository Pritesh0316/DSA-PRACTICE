package LinkedList.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LC0019 {
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

        int n = 2;
        int sz = 0;
        ListNode curr = head;

        while(curr != null){
            curr = curr.next;
            sz++;
        }

        if(sz == n){
            printList(head.next);
            return;
        }

        int steps = sz - n;
        curr = head;
        for(int i=1; i<steps; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        printList(head);
    }
}