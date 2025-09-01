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
    List<List<Integer>> list = new ArrayList<>();
    public int bnToNum(List<Integer> binary){
        int sum = 0;
        for(int i = binary.size()-1 , power = 0 ; i>=0 ; i--,power++){
            sum += (binary.get(i) * Math.pow(2,power));
        }
        return sum;
    }
    public void ans(TreeNode root, List<Integer> bits){
        if(root == null)
            return;
        bits.add(root.val);
        if(root.right==null && root.left==null){
            list.add(bits);
        }
        List<Integer> leftBinary = new ArrayList<>(bits);
        List<Integer> rightBinary = new ArrayList<>(bits);
        ans(root.left , leftBinary );
        ans(root.right , rightBinary );
    }
    public int sumRootToLeaf(TreeNode root) {
        ans(root , new ArrayList<Integer>());
        int answer = 0;
        for(List<Integer> li : list ){
            answer += bnToNum(li);
        }
        return answer;
    }
}