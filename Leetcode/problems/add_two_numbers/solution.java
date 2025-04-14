//  public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Equalification
        ListNode temp1 = l1,temp2 = l2;
        int d1=0,d2=0;
        while(temp1.next!=null){temp1=temp1.next;d1++;}
        while(temp2.next!=null){temp2=temp2.next;d2++;}
        while(d1!=d2){
            if(d1>d2){temp2.next=new ListNode(0);temp2=temp2.next;d2++;}
            else{temp1.next=new ListNode(0);temp1=temp1.next;d1++;}
        }
        //EQF Working Properly

        //Add Elements,Paraller adder
        ListNode temp=l1;
        ListNode cr=new ListNode(0);
        int carry=0,sum=0;
        while(temp!=null){
            sum=(temp.val + l2.val + carry)%10;
            carry=(temp.val + l2.val + carry)/10;
            temp.val=sum;
            if(temp.next==null){cr=temp;}
            temp=temp.next;
            l2=l2.next;
        }
        if(carry!=0){cr.next=new ListNode(carry);}
    return l1;
    }
}