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
    static {
        for (int i = 0; i++ < 500;deleteMiddle(null)) {}
    }
    public static ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next == null) return null;
        ListNode mid = head;
        ListNode fast = head.next.next;
        while(fast!=null && fast.next!=null){
            mid = mid.next;
            fast = fast.next.next;
        }
        mid.next = mid.next.next;
        return head;
    }
}