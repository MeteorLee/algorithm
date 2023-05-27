package 실시간_강의.day2.정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_2 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 4};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length/ 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("Arrays.sort() descending order : " + Arrays.toString(numbers));

        int[] numbers2 = {3, 2, 1, 5, 4,};
        Arrays.parallelSort(numbers2);

        for (int i = 0; i < numbers2.length/2; i++) {
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = temp;
        }
        System.out.println("Arrays.parallelSort() descending order : " + Arrays.toString(numbers2));

    }

}
