package 문제풀이.배열.p10431줄세우기;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();

        // O(P) * O(N^2)
        while (P -- > 0) {

            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }

            int count = 0;
            int[] sorted = new int[20];
            for (int i = 0; i < 20; i++) {
                // 1. 줄 서 있는 학생 중에 자신보다 큰 학생을 찾는다.
                // 1-1. 찾지 못했다면 줄의 가장 뒤에 선다.
                boolean find = false;
                for (int j = 0; j < i; j++) {
                    if (sorted[j] > h[i]) {
                        // 2. 찾았다면, 그 학생의 앞에 선다.
                        // 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        find = true;
                        for (int k = i - 1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            count++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                }
                if (!find) {
                    sorted[i] = h[i];
                }
            }
            System.out.println(T + " " + count);

        }

    }
}
