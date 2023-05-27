package 문제풀이.c1자료구조.p1874스택_수열;

        import java.util.Scanner;
        import java.util.Stack;

public class Answer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            while (count <= data) {
                stack.push(count);
                count += 1;
                sb.append("+\n");
            }
            if (stack.peek() == data) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println(sb.toString());

    }
}
