package 실시간_강의.day1.배열과_리스트;

public class Array_ex1 {
    public static void main(String[] args) {

        int[] score = {100, 70, 82, 94, 64};
        int sum = 0;
        for (int element:
             score) {
            sum += element;
        }
        double average = (double) sum / score.length;
        System.out.println("평균 : " + average);
    }
}
