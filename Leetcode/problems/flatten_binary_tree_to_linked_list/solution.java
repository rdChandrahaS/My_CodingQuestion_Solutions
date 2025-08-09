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
    public void add(TreeNode root, Stack<TreeNode> stack){
        if(root == null) return;
        stack.add(root);
        add(root.left,stack);
        add(root.right,stack);
    }
    public void flatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return;
        Stack<TreeNode> stack = new Stack<>();
        add(root,stack);
        root.left = null;
        root.right = null;
        TreeNode temp = root;
        for(TreeNode node : stack){
            if(root == node) continue;
            TreeNode a = new TreeNode(node.val,null,null);
            temp.right = a;
            temp=temp.right;
        }
    }
}