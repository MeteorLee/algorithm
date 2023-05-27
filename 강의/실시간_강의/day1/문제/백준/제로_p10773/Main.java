package 실시간_강의.day1.문제.백준.제로_p10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            int j = scanner.nextInt();
            if (j == 0) {
                stack.pop();
            } else {
                stack.push(j);
            }
        }

        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}
