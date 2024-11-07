// /*
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
    
//     public ListNode sortList(ListNode head) {
//         //Bruteforce Approach
//         ArrayList<Integer> list=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             list.add(temp.val);
//             temp=temp.next;
//         }
//         Collections.sort(list);
//         int i=0;
//         temp=head;
//         while(temp!=null){
//             temp.val=list.get(i);
//             i++;
//             temp=temp.next;
//         }
//         return head;

//         // Optimal Approach

        
        
        
//     }
// }
public class Solution {
    // Updated function to find the middle of the linked list, returning the node just before the midpoint
    public ListNode findMid(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        ListNode prev = null; // Track the node just before the midpoint

        while (fp != null && fp.next != null) {
            prev = sp;           // Update prev to slow pointer before moving
            sp = sp.next;        // Move slow pointer by 1
            fp = fp.next.next;   // Move fast pointer by 2
        }

        return prev; // Return the node just before the midpoint
    }

    // Function to merge two sorted linked lists
    public ListNode merge(ListNode lh, ListNode rh) {
        ListNode dummy = new ListNode(0); // Dummy node for easier merge
        ListNode tail = dummy;            // Tail pointer to build merged list

        while (lh != null && rh != null) {
            if (lh.val <= rh.val) { // Choose node from lh
                tail.next = lh;
                lh = lh.next;
            } else { // Choose node from rh
                tail.next = rh;
                rh = rh.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes if any
        if (lh != null) tail.next = lh;
        if (rh != null) tail.next = rh;

        return dummy.next; // Return merged list, skipping dummy node
    }

    // Main function to sort the linked list using merge sort
    public ListNode sortList(ListNode head) {
        // Base case: if list is empty or has one element, it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        ListNode midPrev = findMid(head);
        ListNode rh = midPrev.next;
        midPrev.next = null; // Break the list into two halves

        // Recursively sort each half
        ListNode lh = sortList(head);
        rh = sortList(rh);

        // Merge sorted halves
        return merge(lh, rh);
    }
}
