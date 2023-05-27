package 실시간_강의.day5.문제.백준.피보나치수1_p24416.OX퀴즈_p8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(score(arr[i]));
        }


    }

    public static int score(String str) {

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'O'){
                cnt ++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        return sum;


    }
}
