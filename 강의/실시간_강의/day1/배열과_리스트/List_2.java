package 실시간_강의.day1.배열과_리스트;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        list.ensureCapacity(20);

        list.trimToSize();

        list.set(2, "Blueberry");

        List<String> subList = list.subList(1, 3);
        System.out.println("Sublist : " + subList);

        int size = list.size();
        System.out.println("size : " + size);

        String[] array = list.toArray(new String[list.size()]);
        for (String str : array) {
            System.out.println(str);
        }

        int index = list.indexOf("Cherry");
        System.out.println("Index of Cherry : " + index);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Kiwi");
        newList.add("Lemon");
        list.addAll(newList);
        System.out.println("ArrayList after adding a collection : " + list);

    }
}
