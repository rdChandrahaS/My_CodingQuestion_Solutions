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
    public static ListNode merge2List(ListNode list1,ListNode list2){
        if(list1 == null || list2 == null) return (list1==null)?list2:list1;
        ListNode ans=new ListNode(0),temp=ans;
        while(list1 !=null && list2 !=null){
            if(list1.val < list2.val){
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;
            }else{
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;}}
        while(list1 != null){
            temp.next=new ListNode(list1.val);
                temp=temp.next;
                list1=list1.next;}
        while(list2 != null){
            temp.next=new ListNode(list2.val);
                temp=temp.next;
                list2=list2.next;}
        return ans.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0 )return null;
        if(lists.length ==1 )return lists[0];
        ListNode[] temp = new ListNode[(lists.length+1)/2];
        for(int i=0,t=0;i<lists.length && t<temp.length;i+=2,t++){
            temp[t]=((i+1)==lists.length)?merge2List(lists[i],null) : merge2List(lists[i],lists[i+1]);
        }
    return mergeKLists(temp);
    }
}