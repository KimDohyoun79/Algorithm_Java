package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.알고리즘수업점근적표기;
//https://www.acmicpc.net/problem/24313
//https://velog.io/@bassy3260/%EB%B0%B1%EC%A4%80-2426224267%EB%B2%88-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-16-JAVA

import java.io.*;
import java.util.StringTokenizer;

public class BJON_24313 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int f1 = Integer.parseInt(st.nextToken());
        int f2 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(bf.readLine());
        int n0 = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((f1 * n0 + f2 <= c* n0) && c >= f1 ? "1" : "0");
        bw.close();
    }

}