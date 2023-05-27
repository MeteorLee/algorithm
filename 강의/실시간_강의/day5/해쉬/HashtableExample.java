package 실시간_강의.day5.해쉬;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("apple", 10);
        hashtable.put("banana", 20);
        hashtable.put("orange", 30);

        int value = hashtable.get("banana");
        System.out.println("banana value : " + value);

        boolean containsKey = hashtable.containsKey("apple");
        System.out.println("hashTable contains the key 'apple' : " + containsKey);

        boolean containsValue = hashtable.containsValue(20);
        System.out.println("hashTable contains the value '20' : " + containsValue);

        int size = hashtable.size();
        System.out.println("The size of hashtable : " + size);

        hashtable.remove("orange");
        System.out.println("the hashtable after removing 'orange' : " + hashtable);

        for (String key : hashtable.keySet()) {
            int val = hashtable.get(key);
            System.out.println("Key : " + key + ", Value : " + val);
        }
    }
}
