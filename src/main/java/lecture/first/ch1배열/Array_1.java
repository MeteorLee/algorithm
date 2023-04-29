package lecture.first.ch1배열;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int max, min;
        Scanner sc = new Scanner(System.in);

        System.out.printf("5개의 정수를 입력하시요.");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        max = num[0];
        min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
