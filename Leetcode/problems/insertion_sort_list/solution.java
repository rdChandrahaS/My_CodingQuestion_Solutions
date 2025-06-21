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
    public ListNode insertionSortList(ListNode head) {
        ListNode i=head,j=head;
        while(i != null){
            j=i.next;
            while(j != null){
                if(j.val < i.val){
                    //swap(i,j);
                    int temp=j.val;
                    j.val=i.val;
                    i.val=temp;
                }
                j=j.next;
            }
            i=i.next;
        }
        return head;
    }
}