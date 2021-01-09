package PreReviewn;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Review {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int d){
            data = d;
            next = null;
        }
    }

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }


    public ListNode iterateReverse(ListNode root){
        if(root.next == null) return root;
        ListNode current = root;
        ListNode pre = null;

        while (current != null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public ListNode RecursiveReverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode nextNode = head.next;
        ListNode newHead = RecursiveReverse(head.next);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }

    public boolean CheckisBST(TreeNode root,Integer max,Integer min){
        if(root == null) return true;
        if((min!= null && root.value <= min) || (max != null && root.value >= max)) return false;

        return CheckisBST(root.left,root.value,min) && CheckisBST(root.right,max,root.value);
    }

    public static void printPermutation(StringBuilder input, int level, StringBuilder output) {
        if(input.length() == 0){
            System.out.println(output);
            return;
        }

        for(int i = 0 ; i < input.length() ; i++){
            char temp = input.charAt(i);
            output.append(input.charAt(i));
            input.deleteCharAt(i);
            printPermutation(input,level+1,output);
            output.deleteCharAt(level);
            input.insert(i,temp);
        }
    }

    public static void  quicksort(int[] array,int left, int right) {
        if(left > right) return;
        int index  = partition(array,left,right);
        quicksort(array,left,index-1);
        quicksort(array,index+1,right);
    }

    public static int partition(int[] array, int left, int right) {
        int l = left;
        int r = right;

        int pivot = array[left];
        while(l < r){
            while(array[r] >= pivot && l < r){
                r--;
            }
            array[l] = array[r];

            while(array[l] <= pivot && l < r){
                l++;
            }

            array[r] = array[l];
        }

        array[l] = pivot;

        return l;
    }

    public static void main(String[] args){
//        permutation(input,input.length(),result);
//       StringBuilder input = new StringBuilder("abcd");
//       StringBuilder output = new StringBuilder();
//       printPermutation(input,0,output);
       int [] A = {5,1,1,2,0,0};
       quicksort(A,0,A.length-1);
       System.out.println(Arrays.toString(A));
    }
}
