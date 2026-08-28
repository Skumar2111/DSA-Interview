package Leetcodes;

public class ReverseLinkedListKNode {

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

        public ListNode reverseKGroup(ListNode head, int k) {

            if(head == null)
            {
                return head;
            }

            ListNode temp = head;
            int count = 0;
            while(temp != null && count < k)
            {
                temp = temp.next;
                count++;
            }

            ListNode groupHead = reverseKNodes(head,k);

            head.next = reverseKGroup(temp,k);

            return groupHead;

        }

        public ListNode reverseKNodes(ListNode temp , int k)
        {

            ListNode current = temp;
            ListNode prev = null;
            ListNode next = null;

            int count = 0;

            while(current != null && count < k)
            {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;

                count++;
            }

            return prev;

        }

    }

