package 실시간_강의.day3.이진탐색;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        int target = 6;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found at index : " + result);
        }

    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }
}
