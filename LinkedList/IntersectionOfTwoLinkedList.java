/*
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
 * If the two linked lists have no intersection at all, return null.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 =0;
        int len2 =0;
        ListNode temp = headA;
        while(temp != null){
            len1++;
            temp = temp.next;
        }
        System.out.println(len1);
        temp = headB;
        while(temp != null){
            len2++;
            temp = temp.next;
        }
        System.out.println(len2);
        int diff = Math.abs(len1-len2);
        if(diff == 0 && headA == headB)
            return headA;
        int count=0;
        if(len1 > len2){
           // temp = headA;
            while(count<diff){
                headA = headA.next;
                count++;
            }
            
        }
        else if(len2 > len1){
           // temp = headB;
            while(count<diff){
                headB = headB.next;
                count++;
            }
        }
        if(headA == headB)
            return headA;
        while(headA != headB && headA!= null && headB != null){
            headA = headA.next;
            headB = headB.next;
            if(headA == headB)
                return headA;
        }
        return null;
    }
}