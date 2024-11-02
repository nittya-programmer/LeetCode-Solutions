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
    public ListNode oddEvenList(ListNode head) {
       //Bruteforce approach: traverse list in odd and even manner and then replace the values in linked list according to arraylist
       //TC:O(n)
       //SC:O(n)
       //Optimized Approach:TC:O(n) SC:O(1)
       if(head==null || head.next==null){
        return head;
       }
       ListNode evenHead=head.next;
       ListNode ot=head;//odd temp pointer
       ListNode et=head.next;//even temp pointer
       while(et!=null && et.next!=null){
        ot.next=ot.next.next;
        et.next=et.next.next;
        ot=ot.next;
        et=et.next;

       }
       
       ot.next=evenHead;
    return head;
    }
}