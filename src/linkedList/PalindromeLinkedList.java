package linkedList;
/*Given the head of a singly linked list, return true if it is a palindrome.*/

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
    public ListNode mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    /*public int length(ListNode head){
         ListNode fast = head;
        int count =0;
         while(fast != null){
             count++;
             fast = fast.next;
         }
    }*/
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr =  head.next;
        ListNode temp = curr;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head.next = prev;
        return head;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        if(head.next == null)
            return true;
       // int len = length(head);
        ListNode temp = mid(head);
        temp = reverse(temp);
        ListNode fast = head;
        ListNode slow = temp.next;
        
            while( slow!=null){
                if(fast.val != slow.val)
                    return false;
                fast = fast.next;
                slow = slow.next;
        }
        return true;
    }
}