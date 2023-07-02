package 문제풀이.문자열.p1157단어공부;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String str = input.toUpperCase();

        int[] arr = new int[30];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }

        int max = 0;
        int maxIndex = 0;
        boolean isMany = false;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                isMany = false;
                max = arr[i];
                maxIndex = i;
            } else if(max == arr[i]) {
                isMany = true;
            }
        }

        if (isMany) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIndex + 'A'));
        }

    }
}
