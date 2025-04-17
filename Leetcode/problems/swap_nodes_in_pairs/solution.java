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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        int i=0;
        ListNode p1=head,p2=p1.next,h=head;
        while(h!=null){h=h.next;i++;}
        ListNode start=new ListNode(0);
        start.next=p1;
        ListNode ans=start;
        for(int a=0;a<i/2;a++){
            p1.next=p2.next;
            p2.next=p1;
            start.next=p2;
            if(i/2 - a!=1){
            p1=p1.next;
            p2=p1.next;
            start=start.next.next;}
        }
        return ans.next;
    }
}