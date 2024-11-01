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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        //Bruteforce approach : Using hasing
        HashMap<ListNode,Integer>map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp=temp.next;
        }
        return null;

        
        // ListNode slow=head;
        // ListNode fast=head.next;
        // while(fast!=null && fast.next!=null ){
        //     if(slow==fast){
        //         return slow;
        //     }
            
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return null;
    }
}