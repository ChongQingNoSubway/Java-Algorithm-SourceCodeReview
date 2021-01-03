package BinaryTreeAndBinarySearchTree;

public class binaryTree {
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


    public int getHight (TreeNode root){
        if(root == null) return 0;
        int HL = getHight(root.left);
        int HR = getHight(root.right);
        return 1+Math.max(HL,HR);
    }
    // Time  = O(n)
    // space = O(n) =O(heigh)

    public boolean CheckIsbalance (TreeNode root) {
        if(root == null) return true;
        int left = getHight(root.left);
        int right = getHight(root.right);
        if(Math.abs(left - right) > 1){
            return false;
        }
        return CheckIsbalance(root.left) && CheckIsbalance(root.right);
    }

    //Time = O(nlogn)

    public boolean CheckIsSymmetric(TreeNode one, TreeNode two){
        if(one == null && two == null) return true;

        else if( one == null || two == null) return false;

        else if( one.value != two.value) return false;

        return CheckIsSymmetric(one.left,two.right) && CheckIsSymmetric(one.right,two.left);
    }

    public boolean isIdentical(TreeNode one, TreeNode two){
        if(one == null && two == null) {
            return true;
        }else if(one == null || two == null){
            return false;
        }else if(one.value != two.value){
            return false;
        }
        return (isIdentical(one.left,two.left)&&isIdentical(one.right,two.right)) || (isIdentical(one.left,two.right)&&isIdentical(one.right,two.left));
    }
    //time complexity = O(4^loog_2(n)) = O(2^(log_2(n^2)))=O(2^n)


    // How to determine a binary tree is a BST?
    public boolean CheckIsBST(TreeNode root, int min, int max) {
        if(root == null) return true;
        if(root.value > max || root.value < min) return false;
        return CheckIsBST(root.left,min,root.value) && CheckIsBST(root.right,root.value,max);
    }

    //Print BST keys in the given range
    // Given two values K1 and K2 and a root pointer to a binary search tree,
    // print all the keys of tree in range of K1 to K2 (increase order)

    // For BST, if we print out all elements in an  in-order sequence, then
    // they satisfy that they are printed in a increasing order.
    public void  PrintKeysFromBST(TreeNode root, int k1, int k2){
        if(root == null){
            return;
        }
        PrintKeysFromBST(root.left,k1,k2);
        if(k1<root.value && root.value<k2){
            System.out.println(root.value);
        }
        PrintKeysFromBST(root.right,k1,k2);
    }

    // this method time complexity is so big if there are so many node.


}
