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
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)return l1;
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(-1);
        ListNode newHead = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                newHead.next = l1;
                l1 = l1.next;
            }
            else{
                newHead.next = l2;
                l2 = l2.next;
            }
            newHead = newHead.next;
        } 
        if(l1 != null){
            newHead.next = l1;
        }
        else if(l2 != null){
            newHead.next = l2;
        }
        return head.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = findMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);

        return mergeTwoLists(left,right);
    }
}
