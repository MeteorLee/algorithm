package lecture.first.ch1배열;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_1 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        arrayList.add(1, "BlueBerry");
        linkedList.add(1, "BlueBerry");
        vector.add(1, "BlueBerry");

        String element1 = arrayList.get(1);
        String element2 = linkedList.get(1);
        String element3 = vector.get(1);

        int index1 = arrayList.indexOf("Banana");
        int index2 = linkedList.indexOf("Banana");
        int index3 = vector.indexOf("Banana");

        boolean isEmpty1 = arrayList.isEmpty();
        boolean isEmpty2 = linkedList.isEmpty();
        boolean isEmpty3 = vector.isEmpty();

        System.out.println("arrayList = " + arrayList);
        System.out.println("linkedList = " + linkedList);
        System.out.println("vector = " + vector);

        System.out.println("element1 = " + element1);
        System.out.println("element2 = " + element2);
        System.out.println("element3 = " + element3);

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        System.out.println("index3 = " + index3);



    }
}
