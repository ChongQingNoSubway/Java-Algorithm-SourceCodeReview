package PreReviewn;

import BinaryTreeAndBinarySearchTree.binaryTree;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ReviewTwo {
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
    //Question1 : Find all valid way of putting N queens on an N*N chessboard so that no two
    // Queens can attack each other

    public List<List<Integer>> nqueen(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> each = new ArrayList<Integer>();
        if(n <= 0) {
            return res;
        }
        nQueenSolve(n,0,each,res);
        return res;
    }

    public void nQueenSolve(int n, int level, List<Integer> each, List<List<Integer>> res){
        if(level == n) {
            res.add(new ArrayList<Integer>(each));
            return;
        }
        for(int i = 0; i < n; i++) {
            if(passcheck(each,i)){
                each.add(i);
                nQueenSolve(n,level+1,each,res);
                each.remove(each.size() -1);
            }
        }
    }

    public boolean passcheck(List<Integer> each, int col) {
        int row = each.size();
        for(int i= 0; i< row; i++) {
            if(col == each.get(i) || Math.abs(col-each.get(i))== row -i ) {
                return false;
            }
        }
        return true;
    }

    //Question 2: Given a binary tree in which each node element contain a number. Find the Maximum possible sum from
    // one leaf node to another.
    // the maximum sum path may or may not go through root. For example, in the following binary tree. the maximum sum is 3+6+9+0-1+10
    // expected time complexity is O(n)

    public int Maxsum(TreeNode root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int globalMax = Integer.MIN_VALUE;
        maxPath(root,globalMax);
        return globalMax;
    }

    public int maxPath(TreeNode root , int globalMax){
        if(root == null) return 0;

        int LeftSum = maxPath(root.left,globalMax);
        int rightSum = maxPath(root.right,globalMax);
        if(root.left != null && root.right != null) {
            int max = LeftSum + rightSum + root.value;
            globalMax = Math.max(max,globalMax);
            return Math.max(LeftSum,rightSum) + root.value;
        }
        return root.left == null ? rightSum + root.value : LeftSum + root.value;
    }

    // Question 3 : given a string, a partitioning of the string is palindrome partitioning if
    // every substring of the partition is a palindrome, For example, "aba|b|bbabb|a|aba" is a
    // palindrome partitioning of "ababbbabbababa". Determine the fewest cuts needed for palindrome
    // partitioning of a given string. For Example, minimum 3 cuts are needed for "ababababbababa" the
    // tree cuts are "a|babbab|b|ababa", if a string si palindrome, then minimum 0 cuts are needed.

    public int fewcuts(String input) {
        if(input == null || input.length() == 0) return -1;

        int [] dp = new int[input.length() + 1];
        dp[0] = 0;
        for(int i = 1; i <= input.length(); i++) {
            int min = input.length() -1;
            if(palin(input.substring(0,i))){
                dp[i] = 0;
            }else{
                for(int j =1; j < i; i++) {
                    if(palin(input.substring(j,i))){
                        min = Math.min(min,dp[j]+1);
                        dp[i] = min;
                    }
                }
            }
        }
        return dp[input.length()];
    }

    public boolean palin(String str) {
        if(str.length() == 0) return true;
        int i = 0;
        int j = str.length() -1;
        while( i < j) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    //Question4 : Given an integer n , print / output all possible if blocks for it
    public List<String> printif(int n) {
        List<String> res = new ArrayList<String>();
        if( n < 0) {
            return res;
        }
        StringBuilder sb = new StringBuilder();
        printAll(0,0,sb,n,res);
        return res;
    }

    public void printAll(int left, int right, StringBuilder sb, int n, List<String> res) {
        if(left == n && right == n) {
            res.add(format(sb.toString()));
            return;
        }

        if(left < n) {
            sb.append("(");
            printAll(left+1,right,sb,n,res);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right < left) {
            sb.append(")");
            printAll(left,right+1,sb,n,res);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    private String format(String para) {
        StringBuilder builder = new StringBuilder();
        int numSpace = 0;
        for(int i= 0 ; i< para.length() ; i++) {
            if(para.charAt(i) == '(') {
                //addSpace(builder, numSpace);
                builder.append("if{ /n");
                numSpace += 2;
            }else{
                //addSpace(builder, numSpace);
                builder.append("} /n");
                numSpace -= 2;
            }
        }
        return builder.toString();
    }

}
