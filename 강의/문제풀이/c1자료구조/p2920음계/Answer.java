package 문제풀이.c1자료구조.p2920음계;

import java.util.*;
import java.io.*;

public class Answer {
    public static void main(String[] args) throws IOException {

        int n = 8;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                asc = false;
            } else if (arr[i] < arr[i + 1]) {
                desc = false;
            }
        }

        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
