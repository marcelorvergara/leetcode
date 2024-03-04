package net.mvergara.solutions;

public class InvertBinaryTree {

    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        TreeNode() {}
        public TreeNode(int val) {this.val = val;}

        public TreeNode(TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
        }

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public TreeNode invertTree(TreeNode root){
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}
