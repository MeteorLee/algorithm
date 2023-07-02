package 문제풀이.입출력;

import java.math.BigDecimal;
import java.util.Scanner;

public class 입력 {
    public static void main(String[] args) {
        int num;
        long longNum;
        double doubleNum;
        BigDecimal bigDecimal;

        // Scanner 는 import java.util.Scanner; 이 필요
        Scanner sc = new Scanner(System.in);

        String next = sc.next(); // 공백 전까지 문자열
        String nextLine = sc.nextLine(); // 줄바꿈 전까지 문자열
        num = sc.nextInt(); // 공백 전까지
        longNum = sc.nextLong(); // 공백 전까지
        doubleNum = sc.nextDouble(); // 공백 전까지
        bigDecimal = sc.nextBigDecimal(); // 공백 전까지

        // 변환하여 저장하기
        num = Integer.parseInt(sc.next());
        doubleNum = Double.parseDouble(sc.next());



    }
}
