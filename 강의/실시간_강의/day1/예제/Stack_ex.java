package 실시간_강의.day1.예제;

import java.util.*;

// 9012
public class Stack_ex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    Stack < Character > stack = new Stack();
    String s = sc.nextLine();

    for (int i = 0; i < T; i++) {
      s = sc.nextLine();
      for (int j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        if (stack.isEmpty()) stack.push(c);
        else {
          if (c == ')') {
            if (stack.peek() == '(') {
              stack.pop();
            } else {
              stack.push(c);
            }
          } else {
            stack.push(c);
          }
        }
      }
      if (stack.isEmpty()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      stack.clear();
    }
  }
}
