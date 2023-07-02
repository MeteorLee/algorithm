package 문제풀이.문자열.p13223소금폭탄;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String input2 = sc.nextLine();
        String answer = "";

        int[] teacherTime = toTime(input);
        int[] saltTime = toTime(input2);

        int[] answerTime = timeMinus(teacherTime, saltTime);

        for (int i = 0; i < answerTime.length; i++) {
            String str = "";
            if (answerTime[i] < 10) {
                str = "0" + answerTime[i];
            } else {
                str = String.valueOf(answerTime[i]);
            }
            answer += str;
            answer += ":";
        }

        if (answer.equals("00:00:00:")) {
            answer = "24:00:00:";
        }
        System.out.println(answer.substring(0, answer.length() - 1));
    }

    static int[] toTime(String str) {

        int[] time = new int[3];
        String[] split = str.split(":");

        for (int i = 0; i < 3; i++) {
            time[i] = Integer.parseInt(split[i]);
        }

        return time;
    }

    static int[] timeMinus(int[] t1, int[] t2) {

        int[] time = new int[3];

        if (t2[2] - t1[2] < 0) {
            time[2] = t2[2] + 60 - t1[2];
            t2[1]--;
        } else {
            time[2] = t2[2] - t1[2];
        }


        if (t2[1] - t1[1] < 0) {
            time[1] = t2[1] + 60 - t1[1];
            t2[0]--;
        } else {
            time[1] = t2[1] - t1[1];
        }


        if (t2[0] - t1[0] < 0) {
            time[0] = t2[0] + 24 - t1[0];
        } else {
            time[0] = t2[0] - t1[0];
        }


        return time;
    }
}
