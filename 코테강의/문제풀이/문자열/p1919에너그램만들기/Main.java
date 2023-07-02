package 문제풀이.문자열.p1919에너그램만들기;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int answer = 0;

        int[] arr = new int[30];
        int[] arr2 = new int[30];


        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 97]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 97]++;
        }

        for (int i = 0; i < arr.length; i++) {
            answer += Math.abs(arr[i] - arr2[i]);
        }

        System.out.println(answer);

    }
}
