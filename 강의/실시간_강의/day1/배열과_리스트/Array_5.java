package 실시간_강의.day1.배열과_리스트;

import java.util.Arrays;

public class Array_5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // length 메서드 사용
        int length = array.length;
        System.out.println("배열 길어 : " + length);




        int[] clonedArray = array.clone();
        System.out.println("original array: " + Arrays.toString(array));
        System.out.println("cloned array: " + Arrays.toString(clonedArray));
    }
}
