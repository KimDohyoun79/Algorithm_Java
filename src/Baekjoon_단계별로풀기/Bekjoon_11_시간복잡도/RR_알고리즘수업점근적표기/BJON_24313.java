package Baekjoon_단계별로풀기.Bekjoon_11_시간복잡도.RR_알고리즘수업점근적표기;
//https://www.acmicpc.net/problem/24313
//https://velog.io/@bassy3260/%EB%B0%B1%EC%A4%80-2426224267%EB%B2%88-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-16-JAVA

import java.io.*;
import java.util.StringTokenizer;

public class BJON_24313 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int g = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        g *= n;
        int f = Integer.parseInt(st.nextToken()) * n + Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(f <= g ? "1" : "0");
        bw.close();
    }

}