package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
* By Default priority is natural order
* For making min heap ->> Comparator.compare((a,b) -> b - a);
*  */

public class HeapDS {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> b - a);

        priorityQueue.add(10);
        priorityQueue.add(9);
        priorityQueue.add(8);
        priorityQueue.add(7);

        while(!priorityQueue.isEmpty())
        {
            System.out.println("Printing elements :" + priorityQueue.poll());
        }
    }
}
