/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean isCyclePresent(ListNode head,ListNode slow,ListNode fast){
        if(head==null || head.next==null){
            return false;
        }
        
        while(fast!=null && fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        //Bruteforce approach : Using hasing
        // HashMap<ListNode,Integer>map=new HashMap<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     map.put(temp,1);
        //     temp=temp.next;
        // }
        // return null;
        //Tc and Sc both are O(n)

        //Optimal Approach:Tortoise and Hare technique

        // ListNode slow=head;
        // ListNode fast=head;
        // if(isCyclePresent(head,slow,fast)){
        //     slow=head;
        //     while(slow!=fast){
        //         slow=slow.next;
        //         fast=fast.next;
        //     }
        //     return slow;
        // }
        // return null;
        ListNode slow = head;  
        ListNode fast = head;  
    
        // Phase 1: Detect the loop
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;        
            
            // Move fast two steps
            fast = fast.next.next;  
    
            // If slow and fast meet,
            // a loop is detected
            if (slow == fast) {
                // Reset the slow pointer
                // to the head of the list
                slow = head; 
    
                // Phase 2: Find the first node of the loop
                while (slow != fast) {
                    // Move slow and fast one step
                    // at a time
                    slow = slow.next;  
                    fast = fast.next;  
    
                    // When slow and fast meet again,
                    // it's the first node of the loop
                }
                
                // Return the first node of the loop
                return slow;  
            }
        }
        
        // If no loop is found, return null
        return null; 

    }
}