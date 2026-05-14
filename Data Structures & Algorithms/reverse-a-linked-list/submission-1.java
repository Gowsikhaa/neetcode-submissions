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
        if(head == null || head.next == null){
            return head;
        }
        // p      c    n
        //head -> 1 -> 2 -> null
        //         p   c    n 
        //head <- 1    2 -> null

        //head <- 1 <- 2    null
        ListNode prev =null, cur =null, next=null;
        cur = head; // h
        while(cur!=null){
            next = cur.next; //2 , null
            cur.next = prev; 
            prev = cur; // 1 , 2
            cur = next; // 2 , null
        } 
        return prev;
    }
}
