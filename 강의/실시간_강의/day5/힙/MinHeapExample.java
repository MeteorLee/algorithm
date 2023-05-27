package 실시간_강의.day5.힙;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(5);

        System.out.println("Top element of the min heap : " + minHeap.peek());

        minHeap.poll();

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll() + " ");

        }
    }

}
