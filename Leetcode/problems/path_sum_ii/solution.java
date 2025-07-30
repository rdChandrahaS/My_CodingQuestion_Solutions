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
    List<List<Integer>> finalAnswer = new ArrayList<>();
    public void ans(TreeNode root, int targetSum, List<Integer> answer){
        if(root == null) return ;
        if(root.left==null && root.right==null && (root.val-targetSum) == 0){ 
            //answer.add(root.val);
            finalAnswer.add(answer);
        }
        answer.add(root.val);
        List<Integer> left = new ArrayList<>(answer);
        List<Integer> right = new ArrayList<>(answer);
        ans(root.left,targetSum-root.val,left);
        ans(root.right,targetSum-root.val,right);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        ans(root,targetSum,temp);
        return finalAnswer;
    }
}