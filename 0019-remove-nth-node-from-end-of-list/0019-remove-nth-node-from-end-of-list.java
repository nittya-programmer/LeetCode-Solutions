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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        //Find Length
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        //Edge case :
        if(n==length){
            ListNode newHead=head.next;
            return newHead;
        }
        int res=length-n;
        temp=head;
        while(true){
            res--;
            if(res==0){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}