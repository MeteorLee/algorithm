package 실시간_강의.day5.예제;

import java.util.Scanner;

public class implementation_ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total =  sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        }

        if(total == 0) System.out.println("Yes");
        else System.out.println("No");


    }
}
