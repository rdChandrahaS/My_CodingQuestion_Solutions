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
    public int deepestLeavesSum(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> currQueue = new LinkedList<>();
        Queue<TreeNode> prevQueue = new LinkedList<>();
        prevQueue.offer(root);
        while(true){
            for(TreeNode node : prevQueue){
                if(node.left != null){
                    currQueue.offer(node.left);
                }
                if(node.right != null){
                    currQueue.offer(node.right);
                }
            }
            if(currQueue.size()==0){
                for(TreeNode t : prevQueue){
                    ans += t.val;
                }
                prevQueue.clear();
                currQueue.clear();
                break;
            }
            prevQueue = new LinkedList<>(currQueue);
            currQueue.clear();
        }
        return ans;
    }
}