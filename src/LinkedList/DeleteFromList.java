package LinkedList;

public class DeleteFromList {

    static Node head;

    class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    /**/
    void pushToList(int data)
    {
        Node node_to_add = new Node(data);
        node_to_add.next = head;
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


    public Node removeFirst(Node head)
    {
        if(head == null)
        {
            return null;
        }
      return head.next;
    }

    public static void main(String[] args) {

        DeleteFromList deleteFromList = new DeleteFromList();

        deleteFromList.pushToList(10);
        deleteFromList.pushToList(20);
        deleteFromList.pushToList(30);
        deleteFromList.pushToList(40);
        deleteFromList.pushToList(50);

        deleteFromList.printLinkedList(head);

        head = deleteFromList.removeFirst(head);

        System.out.println("After remove");
        deleteFromList.printLinkedList(head);






    }
}
