package 실시간_강의.day5.예제;

import java.util.*;

public class hash_ex2 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap <String, Integer> map = new HashMap<>();
            for(int i = 0; i<clothes.length; i++){
                String key = clothes[i][1];
                if(!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    map.put(key, map.get(key) + 1);
                }
            }
            Iterator<Integer> it = map.values().iterator();
            while(it.hasNext()) {
                answer *= it.next().intValue()+1;
            }
            return answer-1;
        }
    }
}

