package 문자열;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int replaceCount = 0;

        String[] alphabets = new String[] {
                "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
        };
        String str = sc.nextLine();

        for (int i = 0; i < alphabets.length; i++) {
            replaceCount += countAlphabet(str, alphabets[i]);
        }

        count = replaceCount + (str.length() - replaceCount * 2);
        System.out.println(count);

    }

    private static int countAlphabet(String str, String alphabet) {
        String replacedStr = str.replace(alphabet, "");

        int count = (str.length() - replacedStr.length()) / alphabet.length();

        return count;

    }
}