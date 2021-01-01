package QueueStackLinkList;

public class FindLinkListCircle {
    static class ListNode {
        int data;
        ListNode next;
        ListNode (int d) {
            data = d;
            next = null;
        }
    }

    public boolean finder(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

}
