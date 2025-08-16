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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head ; 
        ListNode node1 = head , node2 = head ;  
        while(temp != null){
            temp = temp.next;
            len += 1;
        }
        for(int i = 1 ; i < k ; i++) node1 = node1.next;   
        for(int i = 0 ; i < len-k ; i++) node2 = node2.next; 
        int v = node1.val;
        node1.val = node2.val;
        node2.val = v;
        return head;
    }
}