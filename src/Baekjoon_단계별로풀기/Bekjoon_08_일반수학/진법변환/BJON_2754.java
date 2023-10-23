package Baekjoon_단계별로풀기.Bekjoon_08_일반수학.진법변환;
//https://www.acmicpc.net/problem/2754

import java.io.*;
import java.util.StringTokenizer;

public class BJON_2754 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int re = 0;
        int k = 0;
        for(int i = n.length() - 1; i >= 0; i--){
            int c = n.charAt(i);
            if('0' <= c && c <= '9')
                c -= '0';
            else
                c -= 55;
             re += c * Math.pow(b, k++);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(re));
        bw.close();

    }
}