package 문제풀이.배열.p10431줄세우기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받아 배열 만들기
        int repeat = sc.nextInt();

        for (int r = 0; r < repeat; r++) {

            int thisTime = sc.nextInt();
            int[] student = new int[20];

            for (int i = 0; i < 20; i++) {
                student[i] = sc.nextInt();
            }

            int[] sort= new int[20];
            int count = 0;
            int current = 0;

            // 1번 학생은 일단 세우기
            sort[0] = student[0];
            current++;

            // 19명 학생 들어가기
            for (int i = 1; i < 20; i++) {

                // 자기 앞에 키가 큰 학생이 없어서 그냥 서기
                if (student[i] > sort[current - 1]) {
                    sort[current] = student[i];

                } else {
                    // 자기 앞에 키가 큰 학생이 있다면

                    // 1. 일단 자기보다 키가 작은 학생 위치 찾기
                    int index = -1;
                    for (int j = current - 1; j >= 0; j--) {
                        if (sort[j] < student[current]) {
                            index = j;
                            break;
                        }
                    }
                    // 만약 자기보다 작은 학생이 없다면 제일 앞으로 가야한다.
                    if (index == -1) {
                        for (int j = current - 1; j >= 0; j--) {
                            sort[j + 1] = sort[j];
                            count++;
                        }
                        // 제일 앞에 서기
                        sort[0] = student[i];
                    } else {
                        // 2. 그 학생 뒤로 학생들을 한칸씩 뒤로 미루자
                        // 맨 뒤의 학생부터 시작
                        for (int j = current - 1; j >= index + 1; j--) {
                            sort[j + 1] = sort[j];
                            count++;
                        }
                        // 위치에 서기
                        sort[index + 1] = student[i];

                    }
                }
                current++;
            }

            System.out.printf("%d %d\n", thisTime, count);

        }
    }
}

// 반례
/*
1
1 1 2 3 6 5 4 7 8 9 10 11 12 13 14 15 16 17 18 19 20

1
1 1 2 3 4 6 5 7 8 9 10 11 12 13 14 15 16 17 18 19 20

1
1 1 2 3 4 5 6 7 9 8 10 11 12 13 14 15 16 17 18 19 20
 */
