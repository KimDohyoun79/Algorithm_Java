package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.R_수학은체육과목;
//https://www.acmicpc.net/problem/3009

import java.io.*;
import java.util.StringTokenizer;

public class BJON_15894 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("" + n * 4);
        bw.close();
    }
}