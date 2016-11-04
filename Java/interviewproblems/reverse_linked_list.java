#Reverse a LinkedList in Java
	can be done via recursion and by iteration also

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseListHelper(ListNode node, ListNode prev, ListNode head) {
        if (node.next == null) {
            System.out.println("The last node is " + node.val);
            head = node; // base case
            head.next = prev;
            return head;
        }
        
        
        head = reverseListHelper(node.next, node, head);
        node.next = prev;
        return head;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } if (head.next == null) {
            return head;
        }
        Solution test = new Solution();
        head = test.reverseListHelper(head, null, head); 
        return head;
        
    }
    
    

}
