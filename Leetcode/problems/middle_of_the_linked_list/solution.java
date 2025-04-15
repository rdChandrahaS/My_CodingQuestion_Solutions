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
    public ListNode middleNode(ListNode head) {
        if(head.next==null)return head;
        ListNode temp=head;
        int count=0;
        while(temp.next!=null && temp.next.next!=null){
            temp=temp.next.next;
            head=head.next;
            if(temp.next==null)count++;
        }
        return count%2!=0?head:head.next;
    }
}