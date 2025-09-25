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
    private TreeNode pointer;
    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);

        pointer.right = new TreeNode(root.val);
        pointer = pointer.right;

        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = new TreeNode(0);
        pointer = node;
        inorder(root);
        return node.right;
    }
}