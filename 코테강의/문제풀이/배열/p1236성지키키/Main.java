package 문제풀이.배열.p1236성지키키;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        sc.nextLine();

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            char[] charArray = str.toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = charArray[j];
            }
        }

        int countX = 0;
        int countY = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 'X') {
                    countX++;
                    break;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 'X') {
                    countY++;
                    break;
                }
            }
        }
        int needX = N - countX;
        int needY = M - countY;

        count = Math.max(needX, needY);
        System.out.println(count);


    }
}
