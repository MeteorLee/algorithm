package 실시간_강의.day1.배열과_리스트;

import java.util.Arrays;
import java.util.List;

public class Array_my2 {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 2, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 2, 3, 4, 1};

        // sort() : 배열 정렬
        Arrays.sort(arr1);
        System.out.println("sort() : " + Arrays.toString(arr1));

        // binarySearch() : 배열 이진 탐색
        int searchIndex = Arrays.binarySearch(arr1, 3);
        System.out.println("binarySearch() : " + searchIndex);

        // equals() : 배열이 같은 지 비교
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("equals() : " + isEqual);

        // fill() : 배열의 모든 원소를 특정 값으로 채움
        Arrays.fill(arr3, 0);
        System.out.println("fill() : " + Arrays.toString(arr3));
        Arrays.fill(arr3, 0, 3, 5);
        System.out.println("fill() : " + Arrays.toString(arr3));


        // copyOf() : 배열을 복사합니다.
        int[] copyOfArray1 = Arrays.copyOf(arr2, arr2.length);
        System.out.println("copyOf() : " + Arrays.toString(copyOfArray1));
        arr2[0] = 100;
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("copyOf() : " + Arrays.toString(copyOfArray1));
        arr2[0] = 1;
        int[] copyOfArray2 = Arrays.copyOf(arr2, 3);
        System.out.println("copyOf() : " + Arrays.toString(copyOfArray2));


        // toString() : 배열을 문자열로 변환
        System.out.println("toString() : " + Arrays.toString(arr1));

        // stream() : 배열을 Stream 형식으로 변환
        Arrays.stream(arr1).forEach(System.out::println);

        System.out.println();

        // asList() : 배열을 List형식으로 변환
//        List<Integer> list = Arrays.asList(arr1);
        Integer[] arr4 = {5, 4, 3, 2, 1};
        List<Integer> list = Arrays.asList(arr4);
        for (int i : list) {
            System.out.println(i);
        }

        int[] arr5 = {5, 3, 2, 1, 4};
        List<int[]> list5 = List.of(arr5);


    }
}
