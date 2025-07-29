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
    public boolean subRootmatching(TreeNode root,TreeNode sub){
        if(root==null && sub==null)return true;
        if(root==null || sub==null)return false;
        if(root.val != sub.val)return false;
        return subRootmatching(root.left,sub.left) && subRootmatching(root.right,sub.right);
    }
    public boolean ans(TreeNode root,TreeNode sub){
        if(root==null) return false;
        boolean flag=false;
        if(root.val == sub.val){ 
            flag = subRootmatching(root,sub);}
        return flag || ans(root.left,sub) || ans(root.right,sub);
    }
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        return ans(root,sub);
    }
}