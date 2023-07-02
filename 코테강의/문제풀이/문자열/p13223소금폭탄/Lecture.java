package 문제풀이.문자열.p13223소금폭탄;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String current = sc.next();
        String drop = sc.next();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMin = Integer.parseInt(currentUnit[1]);
        int currentSec = Integer.parseInt(currentUnit[2]);
        int currentSecAmount = currentHour * 3600 + currentMin * 60 + currentSec;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMin = Integer.parseInt(dropUnit[1]);
        int dropSec = Integer.parseInt(dropUnit[2]);
        int dropSecAmount = dropHour * 3600 + dropMin * 60 + dropSec;

        int needSecondAmount = dropSecAmount - currentSecAmount;
        if (needSecondAmount <= 0) {
            needSecondAmount += 24 * 3600;
        }

        int needHour = needSecondAmount / 3600;
        int needMin = (needSecondAmount % 3600) / 60;
        int needSec = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMin, needSec);

    }


}
