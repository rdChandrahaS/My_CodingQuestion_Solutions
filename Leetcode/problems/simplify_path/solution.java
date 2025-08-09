// class Node {
//     Node next;
//     Node prev;
//     String element;
//     private Node head;
//     private Node tail;
//     Node() {}
//     Node(String element) {
//         this.element = element;
//     }
//     public void add(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//         } else {
//             tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//         }
//     }
//     public String remove() {
//         if (tail == null) return null;
//         String removedData = tail.element;
//         if (tail.prev == null) {
//             head = tail = null;
//         } else {
//             tail = tail.prev;
//             tail.next = null;
//         }
//         return removedData;
//     }
//     public String poll() {
//         if (head == null) return null;
//         String removedData = head.element;
//         head = head.next;
//         if (head != null) head.prev = null;
//         else tail = null;
//         return removedData;
//     }
//     public boolean isEmpty() {
//         return head == null;
//     }
// }
class Solution {
    public String simplifyPath(String path) {
        // String[] str = path.split("/+");
        // Node que = new Node();
        // for(String st : str){
        //     if(st.isEmpty() || st.equals(".")) continue;
        //     else if (st.equals("..")) que.remove();
        //     else que.add(st);
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!que.isEmpty()){
        //     String s=que.poll();
        //     sb.append("/"+s);
        // }
        // if(sb.length()==0) sb.append('/');
        // return sb.toString();
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");
        for(String st : str){
            if(st.equals("") || st.equals(".")) continue;
            else if (st.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(st);
        }
        StringBuilder sb = new StringBuilder();
        for(String st : stack){
            sb.append("/").append(st);
        }
        return sb.length()==0?"/" : sb.toString();
    }
}