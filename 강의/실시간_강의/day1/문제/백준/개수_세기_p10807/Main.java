package 실시간_강의.day1.문제.백준.개수_세기_p10807;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int scNum = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == scNum) {
                count++;
            }
        }
        System.out.println(count);
    }

}
