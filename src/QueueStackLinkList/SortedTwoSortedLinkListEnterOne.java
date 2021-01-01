package QueueStackLinkList;

//Question : how to merge two sorted Linklist into one long sorted linked list
//
//why or when should we use a dummy node?
//when we want to append new elements to an initially empty linklist
//we do not have an initial head node. in this case, we can new a dummy node to act as a head node.

public class SortedTwoSortedLinkListEnterOne {
    static class ListNode {
        int data;
        ListNode next;
        ListNode (int d) {
            data = d;
            next = null;
        }
    }

    public ListNode Merge(ListNode head1, ListNode head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        ListNode dummy = new ListNode(0);
        while(cur1.next!=null && cur2.next!= null){
            if(cur1.data> cur2.data ){
                dummy.next = cur2;
                cur2 = cur2.next;
            }else{
                dummy.next = cur1;
                cur1 = cur1.next;
            }
        }

        if(cur1.next != null){
            dummy.next = cur1.next;
        }else if (cur2.next != null){
            dummy.next = cur2.next;
        }

        return dummy.next;
    }
}
