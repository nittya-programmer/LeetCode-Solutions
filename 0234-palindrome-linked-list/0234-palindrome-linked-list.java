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
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=curr.next;
        while(curr.next!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
        return curr;
    }
    public boolean isPalindrome(ListNode head) {
        //Bruteforce Approach: Using Stack 
        // Stack<Integer> s =new Stack<>();
        // ListNode temp=head;
        // while(temp!=null){//Store values of ll into stack s
        //     s.push(temp.val);
        //     temp=temp.next;

        // }
        // temp=head;
        // while(temp!=null){//Compare each element of ll with stored element in stack
        //     if(temp.val!=s.pop()){
        //         return false;
        //     }
        //     temp=temp.next;
        // }
        // return true;
        // Time Complexity:O(n) and Space Complexity :O(n)

        // Optimal Approach: Time Complexity:O(n) and Space Complexity:O(1)
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        
        if(fast==null){//even no of elements
         ListNode newHead=reverseList(slow);
            ListNode temp=head;
            while(newHead!=null){
                if(temp.val!=newHead.val){
                    return false;
                }
                newHead=newHead.next;
                temp=temp.next;
            }
            
        }
        else{//odd no of elements present in list
           ListNode newHead=reverseList(slow.next);
            ListNode temp=head;
            while(newHead!=null){
                if(temp.val!=newHead.val){
                    return false;
                }
                newHead=newHead.next;
                temp=temp.next;
            }
        }
        return true;
    }
}