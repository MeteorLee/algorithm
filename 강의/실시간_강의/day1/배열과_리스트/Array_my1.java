package 실시간_강의.day1.배열과_리스트;

public class Array_my1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};

        int[] clone = arr.clone();

        for (int i = 0; i < clone.length; i++) {
            clone[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i : clone) {
            System.out.print(i + " ");
        }
    }
}
