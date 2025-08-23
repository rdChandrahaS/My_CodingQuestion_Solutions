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
    public TreeNode bnr(int start , int end , int[] arr){
        if(start <= end){
            int mid = (start+end)/2;
            TreeNode head = new TreeNode(arr[mid]);

            head.left = bnr(start , mid-1 , arr);
            head.right = bnr(mid+1 , end , arr);
            return head;
        }
        else return null;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return bnr(0 , nums.length-1 , nums);
    }
}