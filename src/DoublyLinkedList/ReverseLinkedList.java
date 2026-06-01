package DoublyLinkedList;

public class ReverseLinkedList {

    DLLNode head;

    class DLLNode
    {
        int data;
        DLLNode next;
        DLLNode prev;

        DLLNode(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }


    }


    public DLLNode push(int data)
    {
        DLLNode Node_to_add = new DLLNode(data);

        Node_to_add.prev = null;

        if(head == null)
        {
            head = Node_to_add;
            Node_to_add.next = null;
        }
        else
        {
            Node_to_add.next = head;
            head.prev = Node_to_add;
            head = Node_to_add;
        }

        return head;
    }

    public void printDLL(DLLNode head) {

        DLLNode node = head;
        if (head == null) {
            System.out.println("DLL is Empty");
            return;
        }

        while(node != null){

            System.out.println(node.data);
            node = node.next;
        }

    }

    public void printRevDLL(DLLNode head) {

        DLLNode node = head;
        if (head == null) {
            System.out.println("DLL is Empty");
            return;
        }

        while(node != null){

            System.out.println(node.data);
            node = node.prev;
        }

    }


    public DLLNode reverseList(DLLNode head)
    {
        DLLNode current = head;
        DLLNode previous = null;

        if(head == null || head.next == null) return head;

        while(current != null)
        {
            previous = current.prev;
            current.prev = current.next;
            current.next = previous;
            current = current.prev;
        }

        return previous.prev;

    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList  = new ReverseLinkedList();
        reverseLinkedList.push(10);
        reverseLinkedList.push(20);
        reverseLinkedList.push(30);
        reverseLinkedList.push(40);

        System.out.println("Post LL creation");

        reverseLinkedList.printDLL(reverseLinkedList.head);

        reverseLinkedList.head = reverseLinkedList.reverseList(reverseLinkedList.head);

        reverseLinkedList.printDLL(reverseLinkedList.head);

    }
}
