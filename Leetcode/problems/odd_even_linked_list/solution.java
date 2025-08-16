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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        Queue<ListNode> q = new LinkedList<>();
        ListNode pointer = head.next;
        ListNode ans = head;
        while(pointer != null && pointer.next != null) {
            q.offer( pointer );
            pointer = pointer.next.next;
        }
        if(pointer!= null && pointer.next == null)q.offer(pointer);
        pointer = null;

        while(ans != null && ans.next != null && ans.next.next != null){
            ans.next = ans.next.next;
            ans = ans.next;
        }
        while(!q.isEmpty()) {
            ans.next = q.poll();
            ans = ans.next;
        }
        ans.next = null;
        return head;
    }
}