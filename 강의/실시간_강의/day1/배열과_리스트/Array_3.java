package 실시간_강의.day1.배열과_리스트;

import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력해 주세요");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        max = num[0];
        min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        
    }
}
