package QueueStackLinkList;



// recursion way to reverse LinkList

public class RecursionReverseLinkList {
    static class ListNode {
        int data;
        ListNode next;
        ListNode (int d) {
            data = d;
            next = null;
        }
    }

    public ListNode recursionReverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode new_head = recursionReverse(head.next);
        head.next.next = head;
        head.next = null;

        return new_head;

    }

}
