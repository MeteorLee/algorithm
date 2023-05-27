package 문제풀이.c1자료구조.p5397키로거;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tryNumber = Integer.parseInt(br.readLine());

        for (int t = 0; t < tryNumber; t++) {

            ArrayList<String> arrayList = new ArrayList<>();
            StringBuffer bf = new StringBuffer();
            String str = br.readLine();
            int cursor = 0;

            for (int i = 0; i < str.length(); i++) {
                char input = str.charAt(i);

                if (input == '<') {
                    if (cursor > 0) {
                        cursor--;
                    }
                } else if (input == '>') {
                    if (cursor < arrayList.size()) {
                        cursor ++;
                    }
                } else if (input == '-') {
                    if (cursor > 0) {
                        arrayList.remove(cursor - 1);
                        cursor--;
                    }
                } else {
                    arrayList.add(cursor, String.valueOf(input));
                    cursor++;
                }

            }
            for (int i = 0; i < arrayList.size(); i++) {
                bf.append(arrayList.get(i));
            }
            bw.write(bf.toString());
            bw.flush();
        }

    }
}
