package 실시간_강의.day3.문제.백준.회의실배정_p1931;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        Arrays.sort(arr, (a1, a2) ->{
            if (a1[1] == a2[1]){
                return a1[0] - a2[0];
            }
            return a1[1] - a2[1];
        });
        int count = 0;
        int tmp = 0;


        for (int i = 0; i < arr.length; i++) {
            if (tmp > arr[i][0]) {
                continue;
            } else {
                tmp = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }



}
