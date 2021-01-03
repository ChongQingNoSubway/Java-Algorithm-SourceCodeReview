package BinaryTreeAndBinarySearchTree;

public class treeTraverse {
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

    void PreOrder(TreeNode root){
        if(root == null) return; // base case
        System.out.println(root.value + "");
        PreOrder(root.left);
        PreOrder(root.right);
    }


    void InOrder(TreeNode root){
        if(root == null) return;
        InOrder(root.left);
        System.out.println(root.value+"");
        InOrder(root.right);
    }

    void PostOrder(TreeNode root){
        if(root == null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.value+"");
    }
}
