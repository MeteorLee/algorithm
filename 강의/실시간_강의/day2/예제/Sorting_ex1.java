package 실시간_강의.day2.예제;

import java.util.Scanner;
import java.util.Arrays;
 
// 2750
public class Sorting_ex1 {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
 
	}
}
