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
    public void visit(TreeNode root , List<Integer> tr){
        if(root==null) return;
        visit(root.left,tr);
        tr.add(root.val);
        visit(root.right,tr);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> tr1 = new ArrayList<>(); 
        List<Integer> tr2 = new ArrayList<>(); 
        visit(root1,tr1);
        visit(root2,tr2);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<tr1.size() && j<tr2.size()){
            int tri = tr1.get(i);
            int trj = tr2.get(j);
            if(tri < trj){
                ans.add(tri);
                i++;
            }else {
                ans.add(trj);
                j++;
            }
        }
        while(i<tr1.size()) ans.add(tr1.get(i++));
        while(j<tr2.size()) ans.add(tr2.get(j++));
        return ans;


























    }
}