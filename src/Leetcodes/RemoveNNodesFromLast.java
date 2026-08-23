package Leetcodes;

import org.w3c.dom.Node;

/*
19. Remove Nth Node From End of List*/
public class RemoveNNodesFromLast {

    public static void main(String[] args) {
        RemoveNNodesFromLast removeNNodesFromLast = new RemoveNNodesFromLast();



        removeNthFromEnd("pass head to the list");
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public static ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode fast = head;
            ListNode slow = head;

            for(int i = 0 ; i < n ; i++)
            {
                fast = fast.next;
            }

            if(fast == null)
            {
                return head.next;
            }

            while(fast.next != null)
            {
                fast = fast.next;
                slow = slow.next;
            }

            ListNode delNode = slow.next;
            slow.next = slow.next.next;

            delNode = null;

            return head;
        }
    }

