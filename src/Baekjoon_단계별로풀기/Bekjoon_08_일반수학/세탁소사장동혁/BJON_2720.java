package Baekjoon_단계별로풀기.Bekjoon_08_일반수학.세탁소사장동혁;
//https://www.acmicpc.net/problem/2705

import java.io.*;
import java.util.StringTokenizer;

public class BJON_2720 {

    public static void main(String[] args) throws IOException {

        int[] coin = {25, 10, 5, 1};
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());


        while(n-- > 0){
            int c = Integer.parseInt(bf.readLine());
            int[] result = new int[4];
            for(int i = 0; i < 4; i++){
                result[i] = c/coin[i];
                bw.write(String.valueOf(c/coin[i]) + (i == 3 ? "" : " "));
                c %= coin[i];
            }
            bw.newLine();
        }
        bw.close();
    }
}
