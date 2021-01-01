package QueueStackLinkList;

public class PartitionList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;

        ListNode leftHead =  new ListNode(0);
        ListNode rightHead = new ListNode(0);
        ListNode right = rightHead;
        ListNode left = leftHead;

        while(head != null){
            if(head.val < x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }
}
