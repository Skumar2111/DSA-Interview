package Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(40);


        while(!queue.isEmpty())
        {
            System.out.println("Polling the element from queue ... "+queue.poll());
            if(queue.peek()!=null) {
                System.out.println("Next element to be polled ... " + queue.peek());
            }
        }

    }
}
