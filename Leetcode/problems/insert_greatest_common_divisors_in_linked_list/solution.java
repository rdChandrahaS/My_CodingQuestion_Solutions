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
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    static{
        for(int i = 0;i++ < 500 ; insertGreatestCommonDivisors(null)){}
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){
            slow.next = new ListNode( gcd(slow.val,fast.val) , fast );
            slow = fast;
            fast = fast.next;
        }
        return head;
    }
}