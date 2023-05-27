package 실시간_강의.day1.배열과_리스트;

import java.util.Arrays;
import java.util.Iterator;

public class Array_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Iterator를 이용한 접근
        Iterator<Integer> iterator = Arrays.stream(array).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Lamda를 이용한 접근
        Arrays.stream(array).forEach(element -> System.out.println(element));

        // IntStream을 이용한 접근
        Arrays.stream(array).forEach(System.out::println);

    }
}
