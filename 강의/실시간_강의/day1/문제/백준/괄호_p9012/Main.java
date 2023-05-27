package 실시간_강의.day1.문제.백준.괄호_p9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        Stack<Character> stack = new Stack<>();

        sc.nextLine();

        for (int i = 0; i < k; i++) {
            boolean isVPS = true;
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isVPS == true && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();

        }

    }
}
