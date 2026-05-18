package LinkedList.Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LC0160 {
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;
        

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        if(headA==null || headB==null){
            System.out.println("null");
            return;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while(pA != pB){
            if(pA == null){
                pA = headB;
            }else{
                pA = pA.next;
            }

            if(pB == null){
                pB = headA;
            }else{
                pB = pB.next;
            }
        }

        System.out.println(pA.val);
    }
}