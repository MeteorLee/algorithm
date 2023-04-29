package lecture.first.ch1배열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Array_4 {
    public static void main(String[] args) {

        int[] array1 = {3, 1, 4, 2, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 2, 3, 4, 1};

        // sort()
        Arrays.sort(array1);
        System.out.println("sort() : " + Arrays.toString(array1));

        // binarySearch() : 배열에서 원소를 이진 탐색함 (단, 오름차순으로 정렬을 해야함)
        int searchIndex = Arrays.binarySearch(array2, 3);
        System.out.println("binarySearch() : " + searchIndex);

        // equals() : 두 배열이 같은지 비교
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("equal() : " + isEqual);

        // fill() : 배열의 모든 원소를 특정 값으로 채웁니다.
        Arrays.fill(array3, 0);
        System.out.println("fill() : " + Arrays.toString(array3));

        // copyOf() : 배열을 복사합니다.
        int[] copyOfArray1 = Arrays.copyOf(array1, array1.length);
        System.out.println("copyOf () : " + Arrays.toString(copyOfArray1));
        int[] copyOfArray2 = Arrays.copyOf(array1, 2);
        System.out.println("short copyOf () : " + Arrays.toString(copyOfArray2));
        int[] copyOfArray3 = Arrays.copyOf(array1, 7);
        System.out.println("short copyOf () : " + Arrays.toString(copyOfArray3));

        // toString : 배열을 문자열로 변환
        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));

        // Stream() : 배열을 스트림으로 변환
        Arrays.stream(array1).forEach(System.out::println);

        // asList() : 배열을 List 형식으로 변환
        List<int[]> list1 = Arrays.asList(array1);
        System.out.println("Arrays.asList(array1) = " + Arrays.asList(array1));
        
        // 변환 시 List<?>의 제네릭이 int는 불가능하므로 주의
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(intArray);



    }
}
