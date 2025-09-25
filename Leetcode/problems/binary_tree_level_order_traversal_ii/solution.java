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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> prev = new ArrayList<>();
        if(root==null) return ans;
        List<TreeNode> curr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        ans.add(new ArrayList<>(temp));
        prev.add(root);
        if(root.left==null && root.right==null) return ans;

        while(prev.size() > 0){
            temp.clear();
            for(TreeNode node : prev){
                if(node.left != null){
                    curr.add(node.left);
                    temp.add(node.left.val);
                }
                if(node.right != null){
                    curr.add(node.right);
                    temp.add(node.right.val);
                }
            }
            if(temp.size() != 0){
                ans.add(new ArrayList<>(temp));
            }
            prev = new LinkedList<>(curr);
            curr.clear();
        }
        Collections.reverse(ans);
        return ans;
    }
}