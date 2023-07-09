package 문제풀이.자료구조;

public class 문자 {
    public static void main(String[] args) {

        char a = 'a';
        char b = 'b';
        char A = 'A';


        // int형과 char 형태 변환
        System.out.println("int형과 char 형태 변환");
        char ch = 'A';
        int charNum = 'A';
        int num = 65;
        char numChar = 65;

        System.out.println("ch = " + ch);
        System.out.println("charNum = " + charNum);
        System.out.println("num = " + num);
        System.out.println("numChar = " + numChar);
        System.out.println();


        // 연산가능하나 연산 후에는 int 형태이므로 형변환이 필수
        System.out.println("연산가능하나 연산 후에는 int 형태이므로 형변환이 필수");
        System.out.println("('A' + 2) = " + ('A' + 2));
        System.out.println("((char) ('A' + 2)) = " + ((char) ('A' + 2)));
        System.out.println();


        // 대소문자 변환
        System.out.println("대소문자 변환");
        // 연산을 통한 방법
        System.out.println("연산을 통한 방법");
        System.out.println("(char) ('F' + ('A' - 'a')) = " + (char) ('F' + ('a' - 'A')));
        System.out.println("(char) ('f' - ('a' - 'A')) = " + (char) ('f' - ('a' - 'A')));

        // Character 함수
        System.out.println("Character 함수");
        System.out.println("Character.toUpperCase('a') = " + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase('A'));
        System.out.println();


        // 문자 - 숫자 변환 방법
        System.out.println("문자 - 숫자 변환 방법");
        System.out.println("('5' - '0') = " + ('5' - '0'));
        System.out.println("char five = ((char) (5 + '0')) = " + ((char) (5 + '0')));
        System.out.println();

    }
}
