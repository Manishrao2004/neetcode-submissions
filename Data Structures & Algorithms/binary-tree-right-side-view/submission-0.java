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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        if(root==null)
            return res;
        
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        HashMap<Integer,Integer>map=new HashMap<>();

        int l=0;
        while(!q.isEmpty()){
            int len=q.size();

            for(int i=0;i<len;i++){
                TreeNode curr= q.poll();

                if(curr.left!=null)
                    q.offer(curr.left);

                if(curr.right!=null)
                    q.offer(curr.right);

                map.put(l,curr.val);
            }
            l++;
        }
        return new ArrayList<>(map.values());
    }
}
