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
    public int getDecimalValue(ListNode head) {
        ListNode pi = head;
        int pow = -1;
        int ans = 0;
        while(pi!=null){
            pi = pi.next;
            pow++;
        }
        while(head!=null){
            ans += (head.val*Math.pow(2,pow));
            head = head.next;
            pow--;
        }
        return ans;
    }
}