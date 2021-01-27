package StrengthningExercises;

import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Study {
    //Q1: Element deduplication / removal in an array

    //隔板题：
    // 基本思想： 用两个变量，一个变量记录当前指针的位置，一个变量记录隔板的位置
    // 性质1： slow 隔板左边是处理好的元素， 当前指针fast右边是未处理的元素，隔板和当前之间的区域是无用的元素
    //每次只要分析当前元素性质是否要加入或者移动slow隔板就可以了.
    // 性质2： 用快慢两个指针，同向而行，处理完毕之后，return 的结果中，每个integer/char的相对位置不变

    //Q1.1: 给定一个排好序的数组，消除里面重复的元素，对于重复元素只保留一个怎么做
    // index = 0 1 2 3 4
    //         1 1 2 2 3
    // slow : all element to the left hand side of slow are the final result to return.
    // fast : current index

    public int removeDup(int[] input) {
        if (input == null) return -1;
        if (input.length <= 1) return input.length;

        int slow = 1;
        for (int fast = 1; fast < input.length; fast++) {
            if (input[slow - 1] == input[fast]) {
                continue;
            }
            input[slow++] = input[fast];
        }
        return slow;
    }

    // Method 2:
    // slow : all element to the left hand side of slow (including slow) are the final result to return
    // fast: current index

    public int removeDupMethodTwo(int[] input) {
        if (input == null) return -1;
        if (input.length <= 1) return input.length;
        int slow = 0;
        for (int fast = 1; fast < input.length; fast++) {
            if (input[slow] == input[fast]) {
                continue;
            }
            input[++slow] = input[fast];
        }
        return slow + 1;
    }

    // Q1.2 最多只保留两个怎么做
    // index 0 1 2 3 4 5
    // input 1 1 1 2 2 3
    // output 1 1 2 2 3

    // Slow: all elements to the left hand side of slow (exclusive slow) are the final result to return.
    // Fast : current index;

    public int Question2(int[] input) {
        int slow = 2;
        for (int fast = 2; fast < input.length; fast++) {
            if (input[fast] == input[slow - 2]) {
                continue;
            }
            input[slow++] = input[fast];
        }
        return slow;
    }

    //Q1.3: 对于重复的元素一个都不保留
    // index 0 1 2 3 4
    // input 1 1 2 3 3
    // slow : all element to the left hand side of slow (not including slow) are the final result to return
    // fast : current index ;

    public int Question3(int[] input) {
        int fast = 0;
        int slow = 0;

        while (fast < input.length) {
            int begin = fast;

            while (fast < input.length && input[fast] == input[begin]) {
                fast++;
            }
            if (fast - begin == 1) {
                input[slow++] = input[begin];
            }
        }
        return slow;
    }


    //Q1.4 unsorted array, deduplication for adjacent letter repeatedly
    //    a b b b b a z w - > a  a z w -> z w
    // Stack || z w
    // result = "w z" -> reverse -> zw


    //Q1.5 Given an array of random numbers, push all the zero's of a given array to the end of the
    // array. For example, if the given array is {1,9,8,4,0,2,7,0,6,0}, it should be changed to {1,9,8,4,2,7,6,0,0,0,0}
    // expected time O(n) space:O(1)

    // Left index: all elements to the left hand side of left are non zeros,
    // Right index : all elements to the right hand side of right are all zeros.
    // [Left, Right] = unexplored subarray
    // 对向而行 相对位置可能不会变化
    public int QuestionFive(int[] input) {
        int left = 0;
        int right = input.length - 1;
        int temp = 0;
        while (left <= right) {
            if (input[left] != 0) {
                left++;
            } else if (input[right] == 0) {
                right--;
            } else {
                temp = input[right];
                input[right] = input[left];
                input[left] = temp;
                left++;
                right++;
            }
        }
        return left;
    }


    //Q1.6 Given an array of random numbers, push all the zero's of a given array to the end of the
    // array. For example, if the given array is {1,9,8,4,0,2,7,0,6,0}, it should be changed to {1,9,8,4,2,7,6,0,0,0,0}
    // The order of all other element should be same
    // expected time O(n) space:O(1)
    // 同向而行 相对位置不会发生变化

    public void reorder(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int slow = 0;
        int fast = 0;

        while (fast < array.length) {
            if (array[fast] != 0) {
                array[slow++] = array[fast++];
            } else {
                fast++;
            }
        }
        while (slow < array.length) {
            array[slow++] = 0;
        }
    }


    //Question 2.1 Array number comparisons
    // 2.1 use the least number of comparisons to find the largest and smallest number
    //  1  2  4  3  6  5  8  7

    //Question 2.2 how to use the least number of comparisons to find the largest and second largest number?


    //Question3 : 2D array print in spiral order or rotate
    // Question 3.2 : How to rotate an N*N matrix clockwise by 90 defree?

    //BFS print binary tree
    // 4.1 classical way to print the tree level by level

//    public void PrintTree (TreeNode root) {
//        if(root == null) {
//            return;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//            for(int i = 0; i < size; i++) {
//                TreeNode cur = queue.poll();
//                System.out.println(cur.val);
//
//                if(cur.left!= null) {
//                    queue.offer(cur.left);
//                }
//                if(cur.right != null) {
//                    queue.offer(cur.right);
//                }
//            }
//            System.out.println();
//        }
//    }

    //Question 4.2 classical way to print the tree level by level in zig-zag way

    // solution: use a deque
    // case 1 : if we are on the odd level : do the same as bfs1
    // expand a node from the left end of the deque, generate left and then right child , and insert them to the right end of the queue


    // case 2: if we are on the even level :
    // expand a node from the right end of the deque, generate right and then left child,
    // and insert them to the left end of the deque.


    // Question 5: Lowest Common Ancestor in a binary tree

//    public TreeNode LCA(TreeNode root, TreeNode a, TreeNode b) {
//        if(root == null || a == root || b == root ) return root;
//
//        TreeNode left = LCA(root.left, a ,b);
//        TreeNode right = LCA(root.right,a,b);
//
//        if(left != null && right != null) return root;
//
//        return left == null ? right : left ;
//    }
//



    // Question 5 Assume we do have parent pointers in each node



    //Question 5.3 Lowest common ancestors of k nodes
    // General ideas to solve k-something ....

//    public TreeNode LCAThree(TreeNode root, Set<TreeNode> set) {
//        if(root == null || set.contains(root)) {
//            return root;
//        }
//        TreeNode left = LCAThree(root.left,set);
//        TreeNode right = LCAThree(root.right,set);
//
//        if(left!= null && right != null) return root;
//
//        return left == null ? right : left;
//    }


    // Question 5.4 LCA for two nodes in k-naryTree

//    class TreeNode {
//        int val;
//        List<TreeNode> Children;
//    }
//
//    public TreeNode LCA(TreeNode root, TreeNode a, TreeNode b) {
//        if(root == null || a == root || b == root) {
//            return root;
//        }
//
//        int counter = 0;
//        TreeNode temp = null;
//        for (TreeNode child : Children) {
//            TreeNode node = LCA(child, a ,b);
//            if(node!= null) {
//                counter++;
//                if(counter == 2) {
//                    return root;
//                }
//                temp = node;
//            }
//        }
//        return temp;
//    }


    //Question LCA for two nodes a and b in a very large tree that contains billions of nodes,
    // Given 10000 machines


    //Question LCA in binary Search tree


//    public TreeNode solution7 (TreeNode root, TreeNode one, TreeNode two) {
//        if(root == null) return root;
//        if(root.value < one.value && root.value < two.value) {
//            return solution7(root.right,one,two);
//        }else if(root.value > one.value && root.value > two.vaule) {
//            return solution7(root.left,one,two);
//        }else{
//            return root;
//        }
//    }


}
