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
    public ListNode reverseList(ListNode head) {
        //Iterative Approach
        // if(head==null || head.next==null){
        //     return head;
        // }
        // ListNode prev=null;
        // ListNode curr=head;
        // ListNode next=curr.next;
        // while(curr!=null){
        //     curr.next=prev;
        //     prev=curr;
        //     curr=next;
        //     if(curr!=null){
        //         next=next.next;
        //     }
        // }
        // return prev;
        // Recursive Approach
        if(head==null||head.next==null){//Base Case
            return head;
        }
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}