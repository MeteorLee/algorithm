package 실시간_강의.day5.구간합;

public class PrefixSum {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10, 20, 30, 40, 50};
        int[] S = new int[6];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            S[i + 1] = sum;
        }

        int left = 3;
        int right = 4;
        System.out.println(S[right] - S[left - 1]);

    }
}
