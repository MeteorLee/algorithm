package 문제풀이.c1자료구조.기본.p1966프린터_큐;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Node> queue = new LinkedList<>();

        int tryNumber = sc.nextInt();

        for (int t = 0; t < tryNumber; t++) {
            int count = 0;
            int number = sc.nextInt();
            int index = sc.nextInt();

            for (int i = 0; i < number; i++) {
                queue.add(new Node(i, sc.nextInt()));
            }

            while (!queue.isEmpty()) {

                boolean isCurrentMax = true;
                Node current = queue.poll();

                for (int i = 0; i < queue.size(); i++) {

                    Node next = queue.poll();

                    if (next.value > current.value) {
                        isCurrentMax = false;
                    }
                    queue.offer(next);
                }


                if (isCurrentMax) {
                    count++;
                    if (current.index == index) {
                        System.out.println(count);
                    }
                } else {
                    queue.offer(current);
                }
            }


        }


    }
}
class Node {
    Integer index;
    Integer value;

    public Node(Integer index, Integer value) {
        this.index = index;
        this.value = value;
    }
}