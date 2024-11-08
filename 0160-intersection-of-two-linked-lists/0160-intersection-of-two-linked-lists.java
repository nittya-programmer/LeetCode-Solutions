/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //------------------Bruteforce Approach--------------------
        // HashMap<ListNode,Integer> map=new HashMap<>();
        // ListNode ptrA=headA;
        // ListNode ptrB=headB;
        // ListNode temp=headA;
        // while(temp!=null){
        //     map.put(temp,1);
        //     temp=temp.next;
        // }
        // temp=headB;
        // while(temp!=null){
        //     if(map.containsKey(temp)){
        //         return temp;
        //     }
        //     map.put(temp,1);
        //     temp=temp.next;
        // }
        // return null;
        //Time complexity:O(m+n)
        //Space Complexity:O(n) //as we used hash map
        //-----------------------------------------------------------
        //-------------------------Optimal Approach------------------
        if(headA==null||headB==null){
            return null;
        }
        int countA=1;
        int countB=1;
        ListNode temp=headA;
        while(temp.next!=null){
            temp=temp.next;
            countA++;
        }
        temp=headB;
        while(temp.next!=null){
            temp=temp.next;
            countB++;
        }
       ListNode  tempA=headA;
        ListNode tempB=headB;
        int i=1;
        if(countA>countB){
            while(i<=countA-countB){
                tempA=tempA.next;
                i++;
            }
        }
        else{
             while(i<=countB-countA){
                tempB=tempB.next;
                i++;
            }
        }
        while(tempA!=null && tempA.next!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        if(tempA==tempB){//edge case , for last node or when ll have single node
            return tempA;
        }

        return null;



    }
}