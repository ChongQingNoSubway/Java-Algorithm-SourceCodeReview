package StrengthningExercises;

import BinaryTreeAndBinarySearchTree.binaryTree;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudyTwo {

    public class Node {
        int value;
        Node next;
        Node random;

        public Node(int value) {
            this.value = value;
        }
    }

    //Question 1.1 : copy a linked list with random pointer
    // 唯一难点： 建立original node 和copy node 的 一一对应关系，防止一个original node
    // 被重复copy一次以上

   // hash_map <key = original Node, value = copied Node>
    //                  N1                  N1‘

    public Node deepCopyLinkedListWithRandomPointer(Node head) {
        if(head == null) return null;
        Map<Node,Node> lookup = new HashMap<>();
        Node newHead = new Node(head.value);
        lookup.put(head,newHead);
        Node  curr = newHead;

        while(head != null) {
            if(head != null) {
                if(!lookup.containsKey(head.next)) {
                    lookup.put(head.next,new Node(head.next.value));
                }
                curr.next = lookup.get(head.next);
            }
            if(head.random!=null) {
                if(lookup.containsKey(head.random)) {
                    lookup.put(head.random,new Node(head.random.value));
                }
                curr.random = lookup.get(head.random);
            }
            head = head.next;
            curr = curr.next;
        }
        return newHead;
    }

    //Question 1.2 How to copy a graph with possible cycles?
    // G -> G'
    // same with the question 1.1, need a hash_map to check the repeatedly node

    // Method : build a hash_map to avoid duplication when a copying a node
    // Step1: expanding N1 : make a copy of N1.copy(N1,N1'), insert<N1 -> N1'> into the hashmap
    // - generate N2: since N2 is not in the hashmap yet, new (N2'), insert(N2 -> N2') into the hashmap
    // - generate N3: since N3 is not in the hashmap yet, new (N3'), insert<N3,N3'> into hashmap.
    //
    // Step2: expanding N2 :
    // Generate N3 : since N3 is already in the hashmap, so we do not need to new N3'. we only need to find the 1:1 mapping between N3 and N3'.
    //
    // Step3 : expanding N3 :
    // Generate Nothing
    //
    //
    // Method 2 : use DFS

    class Graph  {
        int value;
        List<Graph> neighbprs;

        public Graph(int value) {
            this.value = value;
        }
    }

    public Graph cloneGraph(Graph input, Map<Graph, Graph> lookup) {
        if(input == null) return null;
        if(lookup.containsKey(input)){
            return lookup.get(input);
        }
        Graph copyNode = new Graph(input.value);
        lookup.put(input, copyNode);

        for(Graph neighbor: input.neighbprs) {
            copyNode.neighbprs.add(cloneGraph(neighbor, lookup));
        }
        return copyNode;
    }



    //Question 2 : K-way merge problems:

    //Question 2.1 How to merge K sorted arrays into one big sorted array?
    // Assumption : all K array are sorted in ascending order.
    // General solution for solving K-something problems.
    //  1.Iterative way
    //     Time = (2+3+4+..)*n = O(k^2 *n)
    //  2.binary reduction
    // Time= O(k*n*log(k))
    //  3.k pointers move the smallest one.
    //



    //Question 3.1 Find a node whose value is closest to the target value
    // Given a BST, hot to find the node with its value closet to a target value x?
    //      10
    //   5     15      target == 13
    //  2  7  12 20

    // Solution :
    // Maintain a solution node.
    // Starting from the root node as the current node.
    // case1 : if root == null just return root.
    // case2 : if root.value > target update the solution node if necessary, then walk right
    // case3 : if root.value < target update the solution node if necessary, then walk left
    // case4 ：if root.value == target just return root.

    // Given a BST, how to find the largest element in the tree that is smaaler than a target number x.

    //Solution:
    // case 1 : root.value >= target:
    //      - do not update the current solution.
    //      - go to the left child;
    // case 2: root.value < target;
    //      -update the current solution
    //      -Go to right child.

    // How to remove a target node from BST
    //         10 =cur
    //     5        15          target = 12
    // 2      7   12   20

    //Solution :
    // First , we need to find the target node.
    //  case 1 :    if the node is left node, Easy, just delete this node ,return null.
    //  case 2: if the node has only one Non-null child. just delete this node and return its NON-null child.
    //  case 3 : if the node has both left and right children.
    //      Step1 : Find the node with the smallest value in the current nodes right subtree/
    //      Step2 : Copy the value 12.5 into 12 (target)
    //      step3 : recurse again to delete the node from the original target nodes right subtree.

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }

    public TreeNode delete(TreeNode root, int target) {
        if(root == null) return null;
        if(root.value < target) {
            root.right = delete(root.right,target);
        }
        else if( root.value > target) {
            root.left = delete(root.left,target);
        }
        else{
            if(root.left == null && root.right == null) return null;
            else if( root.left == null || root.right == null) return root.left == null? root.right: root.left;
            else {
                TreeNode smallest = findSmallest(root.right);
                root.value = smallest.value;
                root.right = delete(root.right,smallest.value);
            }
        }
        return root;
    }

    public TreeNode findSmallest (TreeNode root) {
        return root;
    }
    // How to insert a target node to a BST

    // we have to store a parent point.

    //case 1: if curr == null  if  target > parent.value, parent.left =target
    //  else parent.left = target

    //case 2: if target > curr.value, parent = curr, curr = curr.right
    //case 3: if target < curr.value, parent = curr, curr = curr.left;

    //Follow up question(after class) : please use recursion function to implement this question
    // with same idea introduced in 3.3



}
