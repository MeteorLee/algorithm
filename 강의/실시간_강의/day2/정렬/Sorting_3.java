package 실시간_강의.day2.정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_3 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 4);
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order : " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        List<Integer> numbers2 = Arrays.asList(3, 2, 1, 4, 5, 6);
        Collections.sort(numbers2, (n1, n2) -> n2 - n1);
        System.out.println("Sorted by own comparator : " + numbers2);
    }
}
