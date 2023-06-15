package 문제풀이.c1자료구조.고급.p10930SHA_256;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());

        for (byte b: md.digest()) {
            sb.append(String.format("%02x", b));
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();

    }
}
