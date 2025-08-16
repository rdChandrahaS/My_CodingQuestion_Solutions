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
    public ListNode sortList(ListNode head) {
        Queue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        while(head!=null) {
            pq.offer(head);
            head = head.next;
        } 
        ListNode ans = new ListNode(0);
        ListNode temp=ans;
        while(!pq.isEmpty()){
            temp.next = pq.poll();
            temp=temp.next;
        }
        temp.next=null;
        return ans.next;
    }
}