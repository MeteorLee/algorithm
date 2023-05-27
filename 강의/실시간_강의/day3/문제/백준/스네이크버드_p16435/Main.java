package 실시간_강의.day3.문제.백준.스네이크버드_p16435;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= l) {
                l++;
            } else {
                break;
            }
        }
        System.out.println(l);

    }
}


/*


 */