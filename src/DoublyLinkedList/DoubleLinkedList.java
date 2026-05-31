package DoublyLinkedList;



public class DoubleLinkedList {

    DLLNode head;

    class DLLNode {

        int data;
        DLLNode previous;
        DLLNode next;

        DLLNode(int data) {
            this.data = data;
            previous = null;
            next = null;
        }
    }
        public DLLNode addAtStart(int data)
        {
            DLLNode Node_to_add = new DLLNode(data);

            Node_to_add.previous = null;

            if(head == null)
            {
                head = Node_to_add;
                Node_to_add.next = null;
            }
            else
            {

                Node_to_add.next = head;
                head.previous = Node_to_add;
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
        public static void main(String[] args) {

            DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

            doubleLinkedList.addAtStart(10);
            doubleLinkedList.addAtStart(20);
            doubleLinkedList.addAtStart(30);


            doubleLinkedList.printDLL(doubleLinkedList.head);


        }




    }


