package DequeueDataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeueTest {

    public static void main(String[] args) {

        Deque<Integer> deQueue = new ArrayDeque<>();

        deQueue.add(10);
        deQueue.add(30);
        deQueue.add(40);
        deQueue.addLast(50);
        deQueue.addFirst(5);

        System.out.println(deQueue);
    }
}
