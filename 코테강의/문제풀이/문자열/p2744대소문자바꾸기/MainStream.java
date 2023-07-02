package 문제풀이.문자열.p2744대소문자바꾸기;

import java.util.Scanner;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String answer = str.chars()
                .mapToObj(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .map(Character::toString)
                .collect(Collectors.joining());
        System.out.println(answer);

    }
}