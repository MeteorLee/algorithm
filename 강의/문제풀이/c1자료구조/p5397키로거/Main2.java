package 문제풀이.c1자료구조.p5397키로거;

import java.util.*;
import java.io.*;

public class Main2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tryNum = Integer.parseInt(br.readLine());

        for (int t = 0; t < tryNum; t++) {

            String inputStr = br.readLine();

            StringBuffer sb = new StringBuffer();
            Stack<Character> input = new Stack<>();
            Stack<Character> memory = new Stack<>();

            for (int i = 0; i < inputStr.length(); i++) {
                char ch = inputStr.charAt(i);

                if (ch == '<') {
                    if (!input.isEmpty()) {
                        memory.push(input.pop());
                    }
                } else if (ch == '>') {
                    if (!memory.isEmpty()) {
                        input.push(memory.pop());
                    }
                } else if (ch == '-') {
                    if (!input.isEmpty()) {
                        input.pop();
                    }
                } else {
                    input.push(ch);
                }

            }

            while (!memory.isEmpty()) {
                input.push(memory.pop());
            }

            for (Character ch : input) {
                bw.write(ch);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

/*
 10 ^ 6 이라서 NlogN까지만 허용

 */
