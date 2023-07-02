package 문제풀이.문자열.p1543문서검색;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String search = sc.nextLine();

        int count = 0;

        while (input.contains(search)) {

            int index = input.indexOf(search);

            input = input.substring(index + search.length());
            count++;
        }

        System.out.println(count);

    }
}
