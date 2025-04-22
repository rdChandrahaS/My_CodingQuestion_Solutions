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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)return head;
        ListNode start,temp=head;
        int size=1,n;
        while(temp.next!=null){temp=temp.next;size++;}
        n=k%size;
        if(n==0)return head;
        temp.next=head;
        temp=head;
        for(int i=0;i<size-n-1;i++)temp=temp.next;
        head=temp.next;
        temp.next=null;
        return head; 
        
    }
}