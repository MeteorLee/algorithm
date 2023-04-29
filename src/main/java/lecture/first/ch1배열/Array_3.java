package lecture.first.ch1배열;

import java.util.Arrays;

public class Array_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // length 메서드 사용
        int length = array.length;
        System.out.println("length = " + length);

        // clone 메서드 사용
        int[] clonedArray = array.clone();
        System.out.println("clonedArray = " + Arrays.toString(clonedArray));
        System.out.println("array = " + Arrays.toString(array));

        String str = "abced";
        System.out.println("str.contains(\"c\") = " + str.contains("c"));
        System.out.println("str.indexOf(\"c\") = " + str.indexOf("c"));

    }
}
