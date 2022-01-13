/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0 ;
        ListNode result = new ListNode();
        ListNode temp = result ;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
           
            carry = sum / 10;
            ListNode node = new ListNode(sum%10);
            result.next = node;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sum = carry+ l1.val;
             carry = sum / 10;
            ListNode node = new ListNode(sum%10);
            result.next = node;
            result = result.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            sum = carry+ l2.val;
             carry = sum / 10;
            ListNode node = new ListNode(sum%10);
            result.next = node;
            result = result.next;
            l2 = l2.next;
        }
            if(carry > 0){
            ListNode node = new ListNode(carry);
            result.next = node;
            result = result.next;
            }
        return temp.next;
    }
}