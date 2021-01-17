package recursionTwo;

import PreReviewn.Review;
import sun.reflect.generics.tree.Tree;

import javax.xml.soap.Node;
import java.util.Arrays;

public class algorithmLearning {
     public class ListNode{
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

    // Recursion and computing
    // a^b
    // 1/3 as an integer?? or float
    // 0^0

    public double power(int a, int b) {
        if(a == 0 && b <= 0){
            return -1;
        }
        else if( b<0 ){
            return 1/ (double)pow(a,b);
        }else{
            return (double) pow(a,b);
        }

    }

    public int pow(int a, int b) {
        if( b == 0) {
            return 1;
        }
        int half_result = pow(a,b/2);
        if( b % 2 ==0) {
            return half_result*half_result;
        }else{
            return half_result*half_result*a;
        }
    }

    // 2. Recursion and 1D or 2D Array
    // 1D array:
    // merge sort and quick sort


    // 2D array:
    // row by row recursion: 9 queen  -> n queen
    // recursive rule :
    // for the i-th queen on the ith row, we must make sure the queen i does not
    // conflict with all previous queen that have been placed on the board.

    //2.2 How to print 2D array in spiral order (N x N)


    // 3. recursion and Linklist
    // example: 1-> 2 -> 3 -> 4 -> 5 -> null
    // output: 2-> 1 -> 4 -> 3 -> 5 -> null

    public ListNode reversetwo(ListNode cur) {
        if(cur == null || cur.next == null) return cur;

        ListNode next = cur.next;
        ListNode newHead = reversetwo(next.next);
        next.next = cur;
        cur.next = newHead;
        return next;
    }


    // Recursion and String
    // 4.1 reverse a stri ng using recursion
    // abcd -> dcba

    public static  void reverseString (char [] input, int i , int j) {
        if( i >= j) {
            return;
        }
        char temp = 1;
        temp = input [i] ;
        input [i] = input[j];
        input [j] = temp;
        i++;
        j--;

        reverseString(input ,i, j);
        
    }
    // Lowest common ancestor(LCA)
    public TreeNode LowestCommon(TreeNode root, TreeNode a, TreeNode b) {
         if(root == null || root == a || root== b){
             return root;
         }

         TreeNode leftNode = LowestCommon(root.left,a,b);
         TreeNode rightNode = LowestCommon(root.right,a,b);

         if(leftNode != null && rightNode != null) {
             return root;
         }

         return leftNode == null? rightNode: leftNode;
     }



    public static void main (String args[]){
         char [] input = {'a','b','c','d'};
         reverseString(input,0,input.length-1);
         System.out.println(Arrays.toString(input));
    }
}
