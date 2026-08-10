package Leetcodes;

// LeetCode - 141
public class LinkedListCycle {

    public static void main(String[] args) {


        //hasCycle();
    }




      class ListNode {
         int val;
         ListNode next;
          ListNode(int x) {
             val = x;
              next = null;
          }
     }


        public static boolean hasCycle(ListNode head) {


            ListNode slow = head;
            ListNode fast = head;

            while(slow != null && fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast)
                {
                    return true;
                }
            }
            return false;
        }
    }

