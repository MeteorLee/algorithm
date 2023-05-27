package 실시간_강의.day5.문제.백준.피보나치수1_p24416;

import java.io.*;

public class Main {
    public static int fibonacci(int n) {
        int[] fibos = new int[n+1];
        fibos[1] = fibos[2] = 1;
        for (int i = 3; i < n+1; i++) {
            fibos[i] = fibos[i-1] + fibos[i-2];
        }
        return fibos[n];

    }


    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        bw.append(fibonacci(n) + " " + (n - 2));
        bw.close();
        br.close();

    }
}
