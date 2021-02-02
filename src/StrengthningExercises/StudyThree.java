package StrengthningExercises;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudyThree {

    // Recursion |||

    // Tree + recursion
    // use recursion to return value in a bottom-up  way in binary tree
    // what is the definition of a balanced binary tree?

    //Question: Get maximum sum of the path cost from any node to any node
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }
    public int helper(TreeNode root, int max) {
        if(root == null) return 0;

        int left = helper(root.left,max);
        int right = helper(root.right,max);

        left = left < 0 ? 0 : left;
        right = right < 0 ? 0 : right;

        max = max > (root.value + right+ left) ? max : (root.value + left + right);
        return left > right ? (left + root.value) : (right + root.value);
    }

    //Question :  path problem in binary tree
    // discussion :
    // case1 : 人字形的path， 这类题一般需要从下往上传integer value
    // case2 ： 从root 往下 直上直下 path
    //          key point : carry a 直上直下 path prefix while traversing the tree:


    //Question Find  the maximum path cost for all paths from leaf to root
    // in a binary tree. given a binary tree. find the maximum sum path from a leaf to rrot
    // for example, int the following tree, there are three leaf to root path 5 2 19 , -4 -2 10
    // the sums of these three paths are 15 4 17 resprectively, the maximum of them is 17 and the path
    // for maximum is 7 -> 10

    int[] path_prefix_sum = {Integer.MIN_VALUE};
    public void FindMaximumPath (TreeNode root, int sum, int[] path_prefix_sum) {
        if(root == null) return;
        if(root.left == null && root.right ==null) {
            path_prefix_sum[0] = Math.max(path_prefix_sum[0], sum+ root.value);
        }


        FindMaximumPath(root.left, sum + root.value, path_prefix_sum);
        FindMaximumPath(root.right,sum + root.value, path_prefix_sum);
    }

    //Question : given a binary tree in which each node contains an integer number.
    // determine if there exists a path from any node to any node, the sum of the number on the path is eaqul to the given target number/
    List<Integer> path_prefix = new ArrayList<>();
    public void maxPath(TreeNode root, List<Integer>path_prefix, int target, boolean flag) {
        if(root == null) return;

        path_prefix.add(root.value);
        if(helpereumn(path_prefix) == true) {
            flag =true;
        }
        maxPath(root.left,path_prefix,target,flag);
        maxPath(root.right,path_prefix,target,flag);
        path_prefix.remove(root.value);
    }

    boolean helpereumn(List<Integer>path_prefix) {
        return true;
    }

    //Question Maximum path sum binary tree |||
    //Given a binary tree in which each node contain an integer number. Find the maximum
    // possible sum for any node to any node.

    // sum represents [ from the root node to the current node] the largest sum of the path
    // prefix

    public void findMax(TreeNode root, int[] max, int sum) {
        if(root == null) return;

        if(sum < 0) {
            sum = root.value;
        }else {
            sum += root.value;
        }
        max[0] = Math.max(max[0], sum);
        findMax(root.left,max, sum);
        findMax(root.right,max,sum);
    }

    public int AdFindMax(TreeNode root, int[] max, int sum) {
        if(root == null) return 0;

        int left_largest = AdFindMax(root.left,max,sum);
        int right_largest = AdFindMax(root.right,max,sum);

        int temp = Math.max(0,Math.max(left_largest,right_largest));
        max[0] = Math.max(max[0], temp + root.value);

        return temp + root.value;
    }

    //Question : Tree + Recursion : tree serialization problem
    //Given a binary tree , convert it to a DLL(doubly Linked List) in in-order squence
    //    10
    //  5    15          output: 2 5 7 10 12 15 20
    //2   7 12  20

    // key point :
    // 1. when traverse to a current node , we need to know which node was the previous node
    // 2. never ever lost the control over the new head
    static TreeNode pre = null;
    public void DDL(TreeNode root, TreeNode head) {
        if(root == null) return;
        DDL(root.left,head);
        if(pre == null) head = root;
        else {
            root.left = pre;
            pre.right = root;
        }

        pre = root;
        DDL(root.right,head);

    }


    //Question reconstruct a tree by using xx-order and in-order traversal sequences
    // discussion:
    // Reconstruct a tree by using xx-order and in-order traversal sequences

    //Question : how to reconstruct a tree with pre-order and in-order sequence of all nodes
    // 1.表象上： function call itself
    // 2. boll down a big problem into smaller
    // 3. implementation :
    //      base case
    //      recursive rule
    // 4. in more detail

    public TreeNode construct(int[] in, int in_l, int in_r, int[] pre, int pre_l, int pre_r, Map<Integer,Integer> idMap){
        if(in_l > in_r) {
            return null;
        }
        TreeNode root = new TreeNode(pre[pre_l]);
        int leftSite = idMap.get(root.value) - in_l;
        root.left = construct(in, in_l, in_l = leftSite -1,pre,pre_l +1, pre_l + leftSite, idMap);
        root.right = construct(in, in_l + leftSite + 1, in_r,pre,pre_l +1 + leftSite, pre_l , idMap);

        return root;
    }


    //Question Construct a tree form on-order and level order traversal of binary  tree
    // how to reconstruct the binary tree.

}
