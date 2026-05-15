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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode head = new ListNode(0);
        ListNode ret = head;

        while(ptr1 != null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                ret.next = ptr1;
                ret = ret.next;
                ptr1 = ptr1.next;
            }
            else {
                ret.next = ptr2;
                ret = ret.next;
                ptr2 = ptr2.next;
            }
        }
        if(ptr1 != null){   
            ret.next = ptr1;
        }
        if(ptr2 != null){
           ret.next = ptr2;
        }
        return head.next;
    }
}