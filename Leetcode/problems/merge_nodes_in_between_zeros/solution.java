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
    public ListNode mergeNodes(ListNode head) {
        ListNode start = new ListNode(0);
        ListNode pointer = head;
        ListNode temp = start;
        //while(temp.val==0) temp = temp.next;
        start.next = temp;
        while(pointer != null){
            int val = 0;
            while(pointer.val != 0){
                val += pointer.val;
                pointer = pointer.next;
            }
            if(val != 0){
                temp.next = new ListNode(val);
                temp = temp.next;
            }
            pointer = pointer.next;
        }
        return start.next;
    }
}