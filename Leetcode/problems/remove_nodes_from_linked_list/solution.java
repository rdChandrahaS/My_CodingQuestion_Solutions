/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode start = new ListNode(999999);
        ListNode pointer = head;
        while(pointer != null){
            if(st.isEmpty())st.push(pointer);
            else if(st.peek().val >= pointer.val) st.push(pointer);
            else{
                int tempVal = st.peek().val;
                int val = pointer.val;
                while(!st.isEmpty() && tempVal < val){
                    ListNode temp = st.pop();
                    tempVal = temp.val;
                }
                if(tempVal >= val)
                    st.push(new ListNode(tempVal));
                st.push(new ListNode(val));
            }
            pointer = pointer.next;
        }
        pointer = start;
        for(ListNode list : st){
            pointer.next = list;
            pointer = pointer.next;
        }
        return start.next;
        
    }
}