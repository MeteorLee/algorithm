package 문제풀이.시간복잡도.p10158개미;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str;
        StringTokenizer st;
        str = bf.readLine();
        st = new StringTokenizer(str, " ");

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        str = bf.readLine();
        st = new StringTokenizer(str, " ");

        int antX = Integer.parseInt(st.nextToken());
        int antY = Integer.parseInt(st.nextToken());

        str = bf.readLine();

        int time = Integer.parseInt(str);

        int currentX = current(antX, time, W);
        int currentY = current(antY, time, H);

        System.out.printf("%d %d", currentX, currentY);

    }

    public static int current(int ant, int time, int unit) {

        int current;
        int sum = ant + time;

        if (((sum / unit) % 2) == 0) {
            current = sum % unit;
        } else {
            current = unit - (sum % unit);
        }
        return current;
    }
}
