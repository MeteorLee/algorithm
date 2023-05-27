package 실시간_강의.day2.문제.프로그래머스.k번째수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        int[] answer = solution(array,commands);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i< commands.length; i++) {

            List<Integer> arrInt = new ArrayList<>();
            for (int j = commands[i][0] - 1 ; j <= commands[i][1]  - 1 ; j++) {
                arrInt.add(array[j]);
            }
            Collections.sort(arrInt);
            answer[i] = arrInt.get(commands[i][2] - 1);
            arrInt.clear();
        }

        return answer;
    }
}
