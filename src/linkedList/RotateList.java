package linkedList;
/*Given the head of a linked list, rotate the list to the right by k places.*/
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
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        k = k % count;
        while(k-- > 0){ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
           
        }
         ListNode temp = curr.next;
            temp.next = head;
            head = temp;
            curr.next = null;}
        return head;
            
    }
}