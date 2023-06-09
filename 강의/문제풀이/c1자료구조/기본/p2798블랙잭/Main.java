package 문제풀이.c1자료구조.기본.p2798블랙잭;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int condition = sc.nextInt();

        int[] arr = new int[number];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length -2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= condition) {
                        max = Math.max(sum, max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
/*

블랙잭 각 카드는 양의 정수
딜러가 N장의 카드를 숫자가 보이도록 바닥에 놓음
딜러가 숫자 M을 외침
제한된 시간 안에 N장의 카드 중에 3장을 고름
사용자가 고른 3장의 카드의 합은 M을 넘지 않고 최대한 근접
N장의 카드가 써져있는 숫자가 주어졌을 때 M을 넘지 않으며 M에 최대한 가까운 3장의 합을 구해 출력

N < 100 자유롭게 사용 가능 10 ^ 6 < 10 ^ 8
M < 300000 int 사용 가능

 */

/*

for문 3개를 중첩해도 상관 없음

배열에서 숫자를 뽑을 때 1, 2, 3 -> 1, 2, 4 -> ...
첫번째는 0 ~ length -2
두번째는 1 ~ length -1
마지막은 2 ~ length까지

if문은 M은 넘으면 탈락
    통과하면 최댓값 구하기 로직으로 기존 최댓값과 비교 후 크면 갱신

최댓값 출력

 */