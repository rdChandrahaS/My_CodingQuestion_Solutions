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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p2,p1,dummyHead=new ListNode(0);
        dummyHead.next=head;
        if(dummyHead==null)return head;
        p1=dummyHead;
        p2=p1;
        int i=0;
        while(p2.next!=null){p2=p2.next;i++;}
        if(i==1 && n==1)return null;
        for(int a=0;a<i-n;a++)p1=p1.next;

        p1.next=(p1.next==null)?null:p1.next.next;
        return dummyHead.next;
    }
}