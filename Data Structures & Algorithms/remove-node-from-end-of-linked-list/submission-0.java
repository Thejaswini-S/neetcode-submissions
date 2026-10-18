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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //ListNode dummy = new LinkedList<>(-1);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fst = dummy;
        ListNode sec = dummy;

        for(int i = 0; i < n; i++){
            sec = sec.next;
        }
        while(sec.next != null){
            fst = fst.next;
            sec = sec.next;
        }
        fst.next = fst.next.next;

        return dummy.next;
    }
}
