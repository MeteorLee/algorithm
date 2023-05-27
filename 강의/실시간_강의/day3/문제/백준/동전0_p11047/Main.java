package 실시간_강의.day3.문제.백준.동전0_p11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        int count = 0;

        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - i - 1] = sc.nextInt();
        }

        while (money != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (money >= arr[i]){
                    money -= arr[i];
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
