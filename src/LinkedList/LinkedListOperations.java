package LinkedList;

public class LinkedListOperations {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public void push(int data)
    {
        Node node_to_add = new Node(data);
        if (head != null) {
            node_to_add.next = head;
        }
        head = node_to_add;

    }


    public void printLinkedList(Node head)
    {
        Node n = head;
        while(n != null)
        {
            System.out.println(n.data +" ");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        LinkedListOperations linkedListOperations = new LinkedListOperations();
        linkedListOperations.push(10);
        linkedListOperations.push(20);
        linkedListOperations.push(30);

        linkedListOperations.printLinkedList(linkedListOperations.head);


    }
}
