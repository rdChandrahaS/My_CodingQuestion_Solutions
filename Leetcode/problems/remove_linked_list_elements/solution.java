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
    public static ListNode removeElements(ListNode head, int val) {
        
        if(head==null || (head.next==null && head.val==val))return null;
        
        ListNode start=new ListNode(0),p1,p2;
        start.next=head;
        p1=start;
        p2=p1.next;
        while(p1 !=null && p1.next != null && p2 != null ){
            p2=p1.next;
            while(p2!=null && p2.val == val){p1.next=p2.next;p2=p1.next;}
            p1=p1.next;
        }
        return start.next;

    }
}