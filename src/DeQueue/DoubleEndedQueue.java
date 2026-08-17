package DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.addFirst(20);

        deque.addLast(30);



    }
}
