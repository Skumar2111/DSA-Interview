package LinkedList;// A simple Java program for traversal
// of a linked list

class ReverseList
{
    Node head; // head of list

    /* Linked list Node. This inner class is made static so that
       main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next=null; } // Constructor
    }

    /* This function prints contents of linked
           list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }



    public Node reverseList(Node temp)
    {

        Node prev = null;

        while(temp != null)
        {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        ReverseList llist = new ReverseList();

        llist.head     = new Node(1);
        Node second     = new Node(2);
        Node third     = new Node(3);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node



        llist.head = llist.reverseList(llist.head);

        llist.printList();
    }
}