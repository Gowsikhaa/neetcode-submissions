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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode currentNode = head, prevNode = null, nextNode =  nextNode = currentNode.next;
        // h-->1-->2-->3-->null
        // null<--h  1-->2-->3-->null
        while(nextNode!=null){
            nextNode = currentNode.next;

            System.out.println("prev: " + (prevNode != null ? prevNode.val : "null")+ 
            " cur: " +currentNode.val + " next: " + (nextNode != null ? nextNode.val : "null"));
            currentNode.next = prevNode;
    
            prevNode = currentNode;
            currentNode = nextNode;

        }
        return prevNode;
    }
}
