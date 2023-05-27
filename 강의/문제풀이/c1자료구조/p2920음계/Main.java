package 문제풀이.c1자료구조.p2920음계;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[8];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                asc = false;
            }
            if (arr[i] != arr.length - i ) {
                desc = false;
            }

        }

        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
