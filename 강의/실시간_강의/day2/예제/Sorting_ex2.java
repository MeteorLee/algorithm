package 실시간_강의.day2.예제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_ex2 {
    public int[] solution(int[] array, int[][] commands) {
    	 int[] answer = {};
		 answer = new int[commands.length];
		 for(int i =0; i<commands.length; i++) {
			 List<Integer> arrInt = new ArrayList<Integer>();
			 for(int j = commands[i][0]-1; j<commands[i][1]; j++) {
				 arrInt.add(array[j]);
			 }
			 Collections.sort(arrInt);
			 answer[i] =arrInt.get(commands[i][2]-1);
			
		 }
        return answer;
    }
}
