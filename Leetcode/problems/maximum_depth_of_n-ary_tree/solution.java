/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int ans(Node root,int max){
        if (root == null) return max;
        int answer = max;
        for(Node n: root.children){
            answer = Math.max(answer,ans(n,max+1));
        }
        return answer;
    }
    public int maxDepth(Node root) {
        if(root == null) return 0;
        else return ans(root,1);
    }
}