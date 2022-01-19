package linkedList;
/*Given the 
 * head of a singly linked list, reverse the list, and return the reversed list.*/

 
 
 public class ReverseLinkedList{
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 public ListNode reverseList(ListNode head) {
		    
	        ListNode curr = head;
	        ListNode prev = null;
	        while(curr !=null)
	        {
	            if(curr.next == null){
	                head = curr;
	            }
	            ListNode temp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = temp;
	        }
	        return head;
	    }
 }