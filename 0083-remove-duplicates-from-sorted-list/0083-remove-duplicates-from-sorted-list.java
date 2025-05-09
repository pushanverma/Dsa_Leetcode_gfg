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
   public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                ListNode currKaNext = curr.next;

                curr.next = currKaNext.next;

                currKaNext.next = null; // not required
            } else {    
                curr = curr.next;
            }
        }

        return head;
    }
}