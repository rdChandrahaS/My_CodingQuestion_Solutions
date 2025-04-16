/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for(ListNode p1=headA;p1!=null;p1=p1.next){
            for(ListNode p2=headB;p2!=null;p2=p2.next){
                if(p1==p2){return p2;}
            }
        }
        return null;
    }
}