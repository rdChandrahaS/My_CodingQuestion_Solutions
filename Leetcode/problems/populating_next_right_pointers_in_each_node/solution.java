/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        //Node ans = root;
        if(root==null)return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Queue<Node> temp = new LinkedList<>(); 
            Node node = queue.poll();
            if(node.left != null) temp.offer(node.left);
            if(node.right != null) temp.offer(node.right);
            while(!queue.isEmpty()){
                node.next = queue.poll();
                node = node.next;
                if(node.left != null) temp.offer(node.left);
                if(node.right != null) temp.offer(node.right);
            }
            node.next = null;
            queue = temp;
        }
        return root;
    }
}