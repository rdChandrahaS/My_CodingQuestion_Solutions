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
    public int ans(TreeNode root, int val){
        if(root==null) return val;
        int val1=0,val2=0;
        val1 = ans(root.left,val+1);
        val2 = ans(root.right,val+1);

        return val1 > val2 ? val1 : val2;
    }
    public int maxDepth(TreeNode root) {
        return ans(root,0);
    }
}