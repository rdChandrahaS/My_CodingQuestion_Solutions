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
    int l;
    int h;
    int ans = 0;
    public void tre(TreeNode root){
        if(root == null)return;
        if(root.val<= h && root.val>=l)ans += root.val;
        tre(root.left);
        tre(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        h = high;
        l = low;
        tre(root);
        return ans;
    }
}