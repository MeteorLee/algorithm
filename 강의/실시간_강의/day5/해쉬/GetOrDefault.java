package 실시간_강의.day5.해쉬;

import java.util.HashMap;

public class GetOrDefault {
    public static void main(String[] args) {

        String[] alphabet = {"A", "B", "C" , "A"};

        HashMap<String, Integer> hm = new HashMap<>();
        for (String key : alphabet) hm.put(key, hm.getOrDefault(key, 0) + 1);
        System.out.println("결과 : " + hm);

    }
}
