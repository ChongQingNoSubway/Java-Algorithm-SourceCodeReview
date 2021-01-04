package HeapGraphSearchAlgorithm;

import BinaryTreeAndBinarySearchTree.binaryTree;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
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


    public void BFS1(TreeNode root){
        if( root == null ) return;

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i< size; i++){
                TreeNode n = q.remove();

                if(n.left != null){
                    q.offer(n.left);
                }
                if(n.right != null){
                    q.offer(n.right);
                }
                System.out.println();
            }
        }
    }


    // whether a graph's node can be divide into two group, such that the nodes
    // in each group do not have direct edges between the nodes that belong to the
    // same group.

    public boolean checkIsBipartite(){
        return false;
    }

    // Determine whether a binary tree is a complete binary tree
    // After detecting the first node that misses one child , then check
    // whether all following nodes expanded to see whether they have any node
    // node generated (if any -> then false)


    //Discussion
    // 1. when should we consider to use BFS1 to solve a class of question?
    //  when we deal with the Tree-related problem and in the  meantime we need to address the
    // relationship on the same level.
    // 2. BFS-1 is not the right algorithm to find the shortest path in an arbitrary graph.




}
