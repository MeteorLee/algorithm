package 실시간_강의.day1.예제;

import java.io.*;

// 5522
public class Queue_ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;  
      
        for (int i = 1; i <= 5; i++) {
            total += Integer.parseInt(br.readLine()); 
        }
        System.out.print(total);
    }
}
