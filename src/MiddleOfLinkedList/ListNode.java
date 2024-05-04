package MiddleOfLinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode head1 = head.next;
        ListNode head2 = head.next.next;
       while (head != null){
           head = head1.next;
           head = head2.next;
       }
       return head;
    }
}
