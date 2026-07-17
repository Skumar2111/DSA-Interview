package LinkedList;


import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}
class RemoveLoopForList {

    public static void main(String[] args) {

        Node node = new Node(10);
        Node node_1 = new Node(20);
        Node node_2 = new Node(30);
        Node node_3 = new Node(40);

        Stack<Integer> stack;


    }

    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                slow = head;
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            Node temp = slow;
            while(temp.next != slow)
            {
                temp = temp.next;
            }

            temp.next = null;
        }




    }
}