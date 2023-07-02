package 문제풀이.문자열.p1543문서검색;

import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replacedDoc = doc.replace(word, "");
        int docLength = doc.length();
        int replacedDocLength = replacedDoc.length();

        int length = docLength - replacedDocLength;

        int count = length / word.length();

        System.out.println(count);

    }
}
