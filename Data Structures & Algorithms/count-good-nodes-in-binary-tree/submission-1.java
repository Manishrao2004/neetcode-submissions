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
    int dfs(TreeNode root, int maxVal){
        if(root==null)
            return 0;
        
        int res;
        if(root.val>=maxVal)
            res=1;
        else 
            res=0;
        maxVal=Math.max(maxVal,root.val);

        res+=dfs(root.left,maxVal);
        res+=dfs(root.right,maxVal);
        return res;      
    }
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
}
