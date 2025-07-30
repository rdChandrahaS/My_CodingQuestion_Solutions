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
    public void ans(TreeNode root, List<String> list, String s){
        if(root == null) return;
        StringBuilder sb = new StringBuilder(s);
        if(!s.equals(""))sb.append("->");
        sb.append(root.val);
        s = sb.toString();
        if(root.left==null && root.right==null){
            list.add(s);
        }
        ans(root.left,list,s);
        ans(root.right,list,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> a = new ArrayList<>();
        ans(root,a,"");
        return a;
    }
}