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
    public int flag=0,ans=0;
    public void inOrder(TreeNode root,int k){
        if(root == null)return;
        inOrder(root.left,k);
        flag++;
        if(flag==k){ 
            ans = root.val;
            System.gc();
        }
        inOrder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return ans;
    }
}