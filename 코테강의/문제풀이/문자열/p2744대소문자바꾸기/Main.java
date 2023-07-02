package 문제풀이.문자열.p2744대소문자바꾸기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] < 'a') {
                charArray[i] = (char) (charArray[i] + 32);
            } else {
                charArray[i] = (char) (charArray[i] - 32);
            }
            sb.append(charArray[i]);
        }
        System.out.println(sb.toString());

    }
}
