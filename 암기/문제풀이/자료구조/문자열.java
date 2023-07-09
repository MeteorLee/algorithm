package 문제풀이.자료구조;

import java.util.StringTokenizer;
import java.util.stream.Stream;

public class 문자열 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String str2 = "bcdefgh";
        String str3 = "fg";
        String str4 = "";
        String doc = "";
        String word = "";
        int number = 0;
        long longNum = 0;
        double doubleNum = 0.0;

        // 문자 길이
        int strLength = str.length();
        System.out.println("str.length() = " + str.length());
        System.out.println();


        // 몇번째 문자 가져오기
        char ch = str.charAt(3);
        System.out.println("str.charAt(3) = " + ch);
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(str.length() - 1) = " + str.charAt(str.length() - 1));
        System.out.println();


        // 문자를 문자열에 더하기는 자연스럽게 가능
        System.out.println("(\"abc\" + 'A') = " + ("abc" + 'A'));
        System.out.println("(\"ab\" + ' ' + \"cd\") = " + ("ab" + ' ' + "cd"));
        System.out.println();


        // 문자열을 문자의 배열로 변경하기
        String stringToChar = "abc";
        char[] charArray = str.toCharArray();
        System.out.println("char[] charArray = str.toCharArray();");
        System.out.printf("[");
        for (int i = 0; i < charArray.length; i++) {
            System.out.printf(charArray[i] + ", ");
        }
        System.out.printf("]");

        System.out.println();


        // 두 문자열이 같은지 확인
        str = "abc";
        str2 = "bcd";
        str3 = "ABc";
        boolean isEqual = str.equals(str2);
        System.out.println("str.equals(str2) = " + str.equals(str2));
        // 대소문자 구분없이 하는 경우
        System.out.println("str.equals(str3) = " + str.equals(str3));
        // toUpperCase()나 toLowerCase()를 진행한 후 사용
        System.out.println("str.toUpperCase().equals(str3.toUpperCase()) = " + str.toUpperCase().equals(str3.toUpperCase()));
        // isEqualIgnoreCase 사용
        System.out.println("str.equalsIgnoreCase(str3) = " + str.equalsIgnoreCase(str3));

        System.out.println();


        // 대소문자 변경
        doc = "AbCdEf";
        System.out.println("doc.toUpperCase() = " + doc.toUpperCase());
        System.out.println("doc.toLowerCase() = " + doc.toLowerCase());
        // 원래 String은 변경되지 않으므로 따로 담아줘야함
        System.out.println("doc = " + doc);
        System.out.println();


        // 문자열 - 숫자 변경하기
        // 숫자 -> 문자
        number = 123;
        longNum = 123;
        doubleNum = 1.23;
        System.out.println("String.valueOf(number) = " + String.valueOf(number));
        String longNumToString = String.valueOf(longNum);
        // 문자열에 그냥 더하는 것도 문자열로 자동 캐스팅 되므로 ""를 더하는 것도 하나의 방법
        System.out.println("(\"\" + doubleNum) = " + ("" + doubleNum));
        // 문자 -> 숫자
        System.out.println("Integer.parseInt(\"123\") = " + Integer.parseInt("123"));
        System.out.println("Long.parseLong(\"123L\") = " + Long.parseLong("12312312312312312"));
        System.out.println("Double.parseDouble(\"1.232424324\") = " + Double.parseDouble("1.232424324"));
        System.out.println();


        // 존재 여부 / 검색
        doc = "abcd abcd efgh";
        word = "abcd";
        
        // 존재 여부 boolean
        System.out.println("doc.contains(word) = " + doc.contains(word));
        // 몇번째 index에 존재하는지 검색
        System.out.println("doc.indexOf(word) = " + doc.indexOf(word));
        // 없다면 -1을 반환
        System.out.println("doc.indexOf(\"aaa\") = " + doc.indexOf("aaa"));
        // 검색 시작 위치를 지정한 상태로 몇번째 index에 존재하는지 검색
        System.out.println("doc.indexOf(word, 3) = " + doc.indexOf(word, 3));
        System.out.println();


        // 문자열 변경하기
        // 문자열 대체하기
        doc = "abcd abcd efgh";
        // // replace 이후 원래 문자열이 변경되지 않으므로 변경한 문자열을 반환해주므로 따로 저장해야함
        System.out.println("doc.replace(\"abcd\", \"aaa\") = " + doc.replace("abcd", "aaa"));
        System.out.println();

        // 문자열 사이 문자열 가져오기
        doc = "0123456789";
        // 시작 인덱스는 포함하고 뒤의 인덱스는 포함하지 않음
        System.out.println("doc.substring(0, 2) = " + doc.substring(0, 2));
        System.out.println("doc.substring(2) = " + doc.substring(2));
        System.out.println();


        // 문자열 쪼개기
        // split() 이용
        str = "ab:cd:ef";
        String[] strings = str.split(":");
        System.out.println("String[] strings = str.split(\":\");");
        Stream.of(strings)
                        .forEach(System.out::println);
        System.out.println();

        // StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(str, ":");
        System.out.println("StringTokenizer st = new StringTokenizer(str, \":\");");
        while (st.hasMoreTokens()) {
            System.out.println("st.nextToken() = " + st.nextToken());
        }
        System.out.println();


        // 두 문자열을 사전 순으로 비교한 결과
        str = "abc";
        str2 = "bcd";
        str3 = "ebc";
        str4 = "abc";
        int isFirst = str.compareTo(str2);
        // 앞의 문자열이 빠른 경우 음수
        System.out.println("str.compareTo(str2) = " + str.compareTo(str2));
        // 뒤의 문자열이 빠른 경우 양수
        System.out.println("str.compareTo(str3) = " + str3.compareTo(str));
        // 동일한 경우 0
        System.out.println("str.compareTo(str4) = " + str.compareTo(str4));
        System.out.println();


        // 공백 제거
        str = "     a  b  c     ";
        System.out.println("str = " + str);
        // 중간 공백은 안지워짐
        System.out.println("str.trim() = " + str.trim());



    }
}
