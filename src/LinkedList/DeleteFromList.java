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

    public Node removeLast(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node to_delete = head.next;
        Node prev_to_delete = head;

        while(to_delete.next != null)
        {
            prev_to_delete = prev_to_delete.next;
            to_delete = to_delete.next;
        }

        prev_to_delete.next = null;

        return head;
    }


    public Node removeFromLocation(Node head, int index)
    {
        Node current = head;
        Node previous = null;

        int count = 1;

        if(head == null)
        {
            return null;
        }
        else if(index == 1)
        {
            head = head.next;
            return head;
        }

        while(count < index)
        {
            count++;

            if(current != null && count == index)
            {
               previous = current;
               current = current.next;
               count++;
            }

            if(current == null)
            {
                return head;
            }
        }

        previous.next = current.next;

        return head;
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

        System.out.println("After remove Last");
        head = deleteFromList.removeLast(head);
        deleteFromList.printLinkedList(head);

        head = deleteFromList.removeFromLocation(head,3);

        System.out.println("Last list");
        deleteFromList.printLinkedList(head);



    }
}
