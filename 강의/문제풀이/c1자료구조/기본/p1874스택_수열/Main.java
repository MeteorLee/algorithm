package 문제풀이.c1자료구조.기본.p1874스택_수열;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int condition;
        int[] arr = new int[number];
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(0);
        Stack<Integer> outputStack = new Stack<>();

        for(int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
            outputStack.push(number - i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            condition = arr[i];

            while (true) {
                if (condition > inputStack.peek()) {
                    inputStack.push(outputStack.pop());
                    sb.append("+");
                } else if (condition <= inputStack.peek()) {
                    Integer pop = inputStack.pop();
                    sb.append("-");
                    if (pop != condition) {
                        System.out.println("NO");
                        return;
                    }
                    break;
                }
            }

        }

        String answer = sb.toString();
        for (int i = 0; i < answer.length(); i++) {
            System.out.println(answer.charAt(i));
        }

    }

}
