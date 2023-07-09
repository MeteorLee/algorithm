package 문제풀이.배열.p3273두수의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int repeat = sc.nextInt();
        int count = 0;
        int range = 2000000;

        boolean[] arr = new boolean[range + 1];

        for (int i = 0; i < repeat; i++) {
            arr[sc.nextInt()] = true;
        }

        int number = sc.nextInt();

        for (int i = 1; i <= number / 2; i++) {
            if ((arr[number - i] && arr[i]) && (!(number - i == i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
