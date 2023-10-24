package Baekjoon_단계별로풀기.Bekjoon_08_일반수학.중앙이동알고리즘;
//https://www.acmicpc.net/problem/2093

import java.io.*;

public class BJON_2093 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int x = ((int) Math.pow(2, n)) + 1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(x * x));
        bw.close();
    }
}
