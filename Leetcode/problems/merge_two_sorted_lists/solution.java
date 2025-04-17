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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode p1=list1,p2=list2,temp=ans;
        while(p1!=null && p2!=null){
            if(p1.val <= p2.val){
                temp.next=new ListNode(p1.val);
                p1=p1.next;
                temp=temp.next;
            }
            else{
                temp.next=new ListNode(p2.val);
                p2=p2.next;
                temp=temp.next;
            }
        }
        if(p2 == null){
            while(p1!=null){
                temp.next=new ListNode(p1.val);
                p1=p1.next;
                temp=temp.next;
            }
        }else{while(p2!=null){
                temp.next=new ListNode(p2.val);
                p2=p2.next;
                temp=temp.next;
            }}
        return ans.next;
    }
}