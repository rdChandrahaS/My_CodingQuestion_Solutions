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
    List<List<Integer>> ans = new ArrayList<>();
    public void stc(List<TreeNode> list,int count){
        if(list.isEmpty())return;
        else{
            List<TreeNode> tree = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            for(TreeNode node : list){
                if(node.left != null) {
                    tree.add(node.left);
                    temp.add(node.left.val);
                }if(node.right != null) {
                    tree.add(node.right);
                    temp.add(node.right.val);
                }
            }
            if (!temp.isEmpty()){ 
                if(count%2==0)ans.add(temp);
                else{
                    Collections.reverse(temp);
                    ans.add(temp);
                }
            }
            stc(tree,count+1);
        }           
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        ans.add(Arrays.asList(root.val));
        stc(list,1);
        return ans;
    }
}