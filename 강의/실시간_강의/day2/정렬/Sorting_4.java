package 실시간_강의.day2.정렬;

public class Sorting_4 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        insertionSort(array);

        // print the sorted array
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];

                j--;
            }
            arr[j + 1] = current;
        }
    }
}
