package 실시간_강의.day1.문제.백준.카드_게임_p5522;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 5;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);

    }
}
