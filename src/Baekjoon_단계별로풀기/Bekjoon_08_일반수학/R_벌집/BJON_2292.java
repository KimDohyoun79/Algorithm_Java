package Baekjoon_단계별로풀기.Bekjoon_08_일반수학.R_벌집;
//https://www.acmicpc.net/problem/2292

import java.io.*;

public class BJON_2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int count = 1;
        int i = 1;
        if(n != 1){
            while(n > i){
                i = i + (6 * count);
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}