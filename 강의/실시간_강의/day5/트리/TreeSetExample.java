package 실시간_강의.day5.트리;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Dates");


        System.out.println("TreeSet : " + treeSet);

        System.out.println("First Element : " + treeSet.first());

        System.out.println("Last Element : " + treeSet.last());

        System.out.println("HeadSet Element : " + treeSet.headSet("Cherry"));

        System.out.println("TailSet Element : " + treeSet.tailSet("Cherry"));

        System.out.println("SubSet Element : " + treeSet.subSet("Banana" , "Dates"));

        String firstElement = treeSet.pollFirst();
        System.out.println("Removed First Element : " + firstElement);
        System.out.println("TreeSet after removing first element : " + treeSet);

        String lastElement = treeSet.pollLast();
        System.out.println("Removed Last Element : " + lastElement);
        System.out.println("TreeSet after removing last element : " + treeSet);

        System.out.println("Size of TreeSet : " + treeSet.size());

        treeSet.clear();
        System.out.println("TreeSet after clear() method : " + treeSet);

        System.out.println("is TreeSet Empty? : " + treeSet.isEmpty());


    }
}
