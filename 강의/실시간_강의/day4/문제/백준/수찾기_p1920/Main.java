package 실시간_강의.day4.문제.백준.수찾기_p1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = sc.nextInt();
        }
        Arrays.sort(arrN);


        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < arrM.length; i++) {
            arrM[i] = sc.nextInt();
//            System.out.println(binarySearch(arrN, arrM[i]));
        }

        int[] solution = new int[m];


        for (int i = 0; i < solution.length; i++) {
            solution[i] = binarySearch(arrN, arrM[i]);
        }
        for (int s : solution) {
            System.out.println(s);
        }


    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (left <= right) {

            mid = (right + left) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target){
                right = mid - 1;
            }

        }


        return 0;
    }


}
