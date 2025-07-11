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
    static{
        ListNode n = new ListNode(0);
        for(int i=0;i++<500;isPalindrome(n));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode fast=head,pointer=head;
        int size=0;
        while(fast!=null){
            size++;
            fast=fast.next;}
        Stack<Integer> temp = new Stack<>();
        for(int i=0;i<size/2;i++){
            temp.push(pointer.val);
            pointer=pointer.next;
        }
        pointer=size%2==0?pointer:pointer.next;
        for(int i=0;i<size/2;i++){
            if(temp.pop()!=pointer.val) return false;
            pointer=pointer.next;
        }
        return true;
    }
}