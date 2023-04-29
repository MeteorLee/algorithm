package lecture.first.ch1배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dage");

        // 어레이 리스트 용량 증가
        list.ensureCapacity(20);
        System.out.println(list); // 출력 변함 x
        for (String fruit : list) {
            System.out.println("fruit = " + fruit);
        }

        // 어레이 리스트 용량 알맞게 줄이기
        list.trimToSize();

        // 2번 인덱스 값 변화
        System.out.println("list.get(2) = " + list.get(2));
        list.set(2, "Blueberry");
        System.out.println("list = " + list);

        // 인덱스 1 ~ 2 까지의 sublist 만들기
        List<String> subList = list.subList(1, 2);
        System.out.println("subList = " + subList);

        // 어레이 리스트 사이즈 얻기
        int size = list.size();
        System.out.println("size = " + size);

        // 어레이 리스트 배열로 바꾸기
        String[] array = list.toArray(new String[list.size()]);
        List<String> list1 = Arrays.asList(array);
        for (String str : array) {
            System.out.println(str);
        }

        // Cherry의 인덱스 찾기
        int index = list.indexOf("Blueberry");
        System.out.println("index = " + index);

        System.out.println("List.of(array).indexOf(\"Blueberry\") = " + List.of(array).indexOf("Blueberry"));

        // 리스트에 다른 리스트 추가하기
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Kiwi");
        newList.add("Lemon");
//        list.addAll(newList);
        list.addAll(2, newList);

        System.out.println("list = " + list);

    }
}
