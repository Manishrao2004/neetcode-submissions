/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    void invert(TreeNode node){
        TreeNode temp= node.left;
        node.left=node.right;
        node.right=temp;
    }

    void preorder(TreeNode root){
        if(root==null)
            return;
        invert(root);
        preorder(root.left);
        preorder(root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        preorder(root);
        return root;
    }
}
