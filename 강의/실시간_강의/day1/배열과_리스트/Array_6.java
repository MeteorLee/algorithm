package 실시간_강의.day1.배열과_리스트;

import java.util.Arrays;

public class Array_6 {
    public static void main(String[] args) {

        int[] array1 = {3, 1, 4, 2, 5,};
        int[] array2 = {1, 2, 3, 4, 5,};
        int[] array3 = {5, 2, 3, 4, 1,};

        // sort() 배열 정렬
        Arrays.sort(array1);
        System.out.println("sort() : " + Arrays.toString(array1));

        int serachIndex = Arrays.binarySearch(array1, 3);
        System.out.println("binarySearch() :"  + serachIndex);
    }




}
