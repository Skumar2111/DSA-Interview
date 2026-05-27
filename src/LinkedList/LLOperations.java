package LinkedList;

public class LLOperations {

    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int d) {data = d ; next = null;}
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLL(Node head)
    {
        Node n = head;
        while(n != null)
        {
            System.out.println(n.data +" ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LLOperations llOperations = new LLOperations();
        llOperations.push(10);
        llOperations.push(20);
        llOperations.push(30);


        llOperations.printLL(llOperations.head);

    }
}
