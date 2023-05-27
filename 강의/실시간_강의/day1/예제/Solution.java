package 실시간_강의.day1.예제;

class Solution {
	public static String solution(String s) {
		String answer = "";

		if(s.length() % 2 == 0) {
			answer += s.charAt(s.length() / 2 - 1);
			answer += s.charAt(s.length() / 2);
		} else {
			answer += s.charAt(s.length() / 2);
		}

		return answer;
	}

	public static void main(String[] args) {
		String ans = solution("hey");
		System.out.println(ans);

	}

}
