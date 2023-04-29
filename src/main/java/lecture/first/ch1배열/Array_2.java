package lecture.first.ch1배열;

import java.util.Arrays;
import java.util.Iterator;

public class Array_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // for-each
        for (int element : array) {
            System.out.println(element);
        }

        // Iterator
        Iterator<Integer> iterator = Arrays.stream(array).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 람다식
        Arrays.stream(array).forEach(element -> System.out.println(element));

        // IntStream
        Arrays.stream(array).forEach(System.out::println);


    }
}
