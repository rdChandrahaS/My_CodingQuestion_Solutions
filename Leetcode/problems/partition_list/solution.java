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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)return head;
        ListNode start = new ListNode(x-1,head);
        ListNode temp=start , curr = head , prev = start , replace = start;
        while(temp != null){ // To Gt the First replace point
            if(temp.val < x){
                replace = temp;
                temp=temp.next;
            }else temp=null;
        }
        while(curr != null && curr.val < x){
            prev=prev.next;
            curr=curr.next;
        }
        while( curr != null ){
            if(curr != replace && curr.val < x ){
                prev.next = curr.next;
                curr.next = replace.next; 
                replace.next = curr;
                curr = prev.next;
                replace = replace.next;
            }else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        temp=null;
        curr=null;
        prev=null;
        replace=null;
        head=null;
        return start.next;
    }
}