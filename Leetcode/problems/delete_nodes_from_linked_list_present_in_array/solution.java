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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> arr = new HashSet<>();
        for(int i : nums)arr.add(i);
        ListNode start = new ListNode(-1,head);
        ListNode slow = start; 
        ListNode fast = head; 
        while(fast != null){
            while(fast!=null && arr.contains(fast.val) ) fast = fast.next;
            slow.next = fast;
            slow = fast; 
            if(fast != null)fast = fast.next;
        }
        return start.next;
    }
}