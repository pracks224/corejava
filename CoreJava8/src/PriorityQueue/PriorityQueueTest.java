package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(50);
        queue.add(20);
        queue.add(30);
        System.out.println(queue.peek());
    }
}
