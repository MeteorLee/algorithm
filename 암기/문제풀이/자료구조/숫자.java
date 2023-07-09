package 문제풀이.자료구조;

import java.math.BigDecimal;

public class 숫자 {
    public static void main(String[] args) {
        int num = 1;
        byte byteNum = 2;
        long longNum = 3L;
        double doubleNum = 1.1;
        float floatNum = 2.2F;

        // 자동 형 변환 가능한 경우는 작은 자료형 -> 큰 자료형
        longNum = num + byteNum;
        doubleNum = floatNum + floatNum;

        // Float와 Long은 선언 시 L을 붙여야 함 (long의 경우 작은 숫자면 int로 간주하여 그냥 자동 형변환)
        longNum = 123;
        longNum = 1230231830213231L;
        floatNum = 1.1F;
        doubleNum = 1.1;

        // BigDecimal을 만드려면 valueOf를 사용하자
        BigDecimal bigDecimalNum = BigDecimal.valueOf(num);
        BigDecimal bigDecimalLong = BigDecimal.valueOf(longNum);
        BigDecimal bigDecimalDouble = BigDecimal.valueOf(doubleNum);

    }
}
