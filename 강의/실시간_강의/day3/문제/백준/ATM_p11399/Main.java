package 실시간_강의.day3.문제.백준.ATM_p11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int sum = 0;
        int pre = 0;

        for (int i = 0; i < arr.length; i++) {
            int tmp = pre + arr[i];
            sum += tmp;
            pre = tmp;
        }
        System.out.println(sum);
    }
}
