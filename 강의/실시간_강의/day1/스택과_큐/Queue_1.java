package 실시간_강의.day1.스택과_큐;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Head of queue : " + queue.peek());

        System.out.println("Removed element : " + queue.remove());

        System.out.println("Queue empty: " + queue.isEmpty());

        System.out.println("Polled element " + queue.poll());

        queue.clear();

        System.out.println("Queue empty : " + queue.isEmpty());

        try {
            System.out.println("Head of queue: " + queue.element());
        } catch (Exception e) {
            System.out.println("Queue is empty");
        }
    }
}
