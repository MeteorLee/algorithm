package 문제풀이.배열.p10989수_정렬하기3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int repeat = Integer.parseInt(bf.readLine());

        int[] arr = new int[10001];

        for (int i = 0; i < repeat; i++) {
            int number = Integer.parseInt(bf.readLine());
            arr[number]++;
        }

        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < arr[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.flush();

    }
}
