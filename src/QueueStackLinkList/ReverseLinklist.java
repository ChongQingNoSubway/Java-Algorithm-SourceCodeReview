package QueueStackLinkList;

// how to reverse a linked list


public class ReverseLinklist {
    static class ListNode {
        int data;
        ListNode next;
        ListNode (int d) {
            data = d;
            next = null;
        }
    }

    public ListNode reverser(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
