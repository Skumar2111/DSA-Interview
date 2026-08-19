package Leetcodes;

import Leetcodes.LinkedListCycle;

/*LeetCode 876*/

  public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


class MiddleLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        middleNode(head);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}