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
    public void invert(TreeNode root){
        if(root == null) return;
        else if(root.left == null && root.right != null){
            root.left = root.right;
            root.right = null;}
        else if(root.left != null && root.right == null){
            root.right = root.left;
            root.left = null;}
        else{
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;}
        invert(root.left);
        invert(root.right);
    }
    public TreeNode copyTree(TreeNode root){
        if(root == null) return null;
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left=copyTree(root.left);
        newRoot.right=copyTree(root.right);
        return newRoot;
    }
    public boolean isSame(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return isSame(p.left , q.left) && isSame(p.right , q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode inverted ;
        invert(inverted=copyTree(root));
        return isSame(root,inverted);
    }
}