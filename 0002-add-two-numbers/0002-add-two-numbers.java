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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode temp1=l1,temp2=l2;
        int carry=0,s=0;
        ListNode prev1=temp1,prev2=temp2;
        while(temp1!=null && temp2!=null){
            s=carry+temp1.val+temp2.val;
            temp1.val=(s)%10;
            carry=s/10;
            prev1=temp1;
            prev2=temp2;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        
            if(temp2==null){
                while(temp1!=null){
                s=carry+temp1.val;
            temp1.val=(s)%10;
            carry=s/10;
            prev1=temp1;
            temp1=temp1.next;
        }
        if(carry>0){
            prev1.next=new ListNode(carry);
            prev1.next.next=null;
        }
            }
        
        else{
            prev1.next=temp2;
        while(temp2!=null){
            s=carry+temp2.val;
            temp2.val=(s)%10;
           
            carry=s/10;
            prev2=temp2;
            temp2=temp2.next;
        }
         if(carry>0){
            prev2.next=new ListNode(carry);
            prev2.next.next=null;
        }
        }
        return l1;
    }
}