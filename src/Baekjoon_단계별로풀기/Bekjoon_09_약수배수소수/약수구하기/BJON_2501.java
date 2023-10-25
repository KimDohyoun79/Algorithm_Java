package Baekjoon_단계별로풀기.Bekjoon_09_약수배수소수.약수구하기;
//https://www.acmicpc.net/problem/2501

import java.io.*;
import java.util.StringTokenizer;

public class BJON_2501 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int i = 1;
        int count = 0;
        while (count < k && i <= n) {
            if (n % i++ == 0)
                count++;
        }

        int re = count == k ? i-1 : 0;

        bw.write(String.valueOf(re));
        bw.close();
    }
}