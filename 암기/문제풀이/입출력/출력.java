package 문제풀이.입출력;

import java.math.BigDecimal;

public class 출력 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        String str;
        String str2;
        long longNum;
        double doubleNum;
        BigDecimal bigDecimal;
        
        // 문자열 포맷 코드
        // 정수
        num = 123;
        System.out.println("num = " + num);
        System.out.printf("%d\n", num);
        System.out.printf("%05d\n", num); // 0 채움
        System.out.printf("%5d\n", num); // 공백
        System.out.printf("%1d\n", num); // 글자수보다 적어도 알아서 출력함
        System.out.println();

        // 실수
        doubleNum = 123.7238;
        System.out.println("doubleNum = " + doubleNum); // println()의 경우 그냥 자리수까지만 표현
        System.out.printf("%f\n", doubleNum); // 기본적으로 소수점을 6자리까지 표현 (빈 자리는 0으로 채움)
        System.out.printf("%020f\n", doubleNum); // 0으로 채우기
        System.out.printf("%20f\n", doubleNum); // 공백으로 채우기
        System.out.printf("%.10f\n", doubleNum); // . 뒤로는 소수점에 관해서 자릿수
        System.out.printf("%.3f\n", doubleNum); // 모자란 자릿수는 반올림함
        System.out.printf("%.2f\n", doubleNum); // 모자란 자릿수는 반올림함
        System.out.printf("%.0f\n", doubleNum); // 모자란 자릿수는 반올림함
        System.out.printf("%1.0f\n", doubleNum); // 실수부는 반올림 안됨
        System.out.printf("%030.10f\n", doubleNum); // 같이 사용가능
        System.out.printf("%010.30f\n", doubleNum); // 소숫점 먼저 계산함

    }
}
