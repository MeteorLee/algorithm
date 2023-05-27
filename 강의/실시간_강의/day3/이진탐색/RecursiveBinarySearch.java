package 실시간_강의.day3.이진탐색;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 9};
        int target = 6;
        int left = 0;
        int right = arr.length - 1;

        int result = binarySearch(arr, target, left, right);

        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at index : " + result);
        }

    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right);
            } else {
                return binarySearch(arr, target, left, mid - 1);
            }
        }

        return -1;
    }
}
