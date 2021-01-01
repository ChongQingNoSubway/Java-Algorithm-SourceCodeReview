package QueueStackLinkList;
// how to find the middle node of a linked list

public class FindMiddleNode {

    static class ListNode {
        int data;
        ListNode next;
        ListNode (int d) {
            data = d;
            next = null;
        }
    }

    public ListNode finder(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
