package 실시간_강의.day1.스택과_큐;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        int removedElement = stack.pop();
        System.out.println("removed element : " + removedElement);

        int topElement = stack.peek();
        System.out.println("Top element : " + topElement);

        boolean isStackEmpty = stack.empty();
        System.out.println("is stack empty? " + isStackEmpty);

        stack.push(3);

        int position1 = stack.search(1);
        System.out.println("Position of 1 : " + position1);

        int position2 = stack.search(2);
        System.out.println("Position of 2 : " + position2);

        int position3 = stack.search(3);
        System.out.println("Position of 3 : " + position3);

        System.out.println();
        System.out.println("stack : " + stack);

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

    }
}
