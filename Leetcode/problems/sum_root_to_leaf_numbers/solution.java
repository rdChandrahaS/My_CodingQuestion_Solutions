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
    public List<Integer> ans = new ArrayList<>();;
    public void traversal(TreeNode root , int number){
        if(root==null) return;
        if(root.left == null && root.right == null){
            ans.add(number*10 + root.val);
            return;
        }
        traversal(root.left , number*10 + root.val);
        traversal(root.right , number*10 + root.val);
    } 
    public int sumNumbers(TreeNode root) {
        int a=0;
        traversal(root , 0);
        for(int i=0;i<ans.size();i++){
            a+=ans.get(i);
        }
        return a;
    }
}