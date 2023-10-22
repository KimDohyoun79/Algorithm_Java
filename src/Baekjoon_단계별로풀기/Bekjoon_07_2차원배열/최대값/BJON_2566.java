package Baekjoon_단계별로풀기.Bekjoon_07_2차원배열.최대값;
//https://www.acmicpc.net/problem/2566

import java.io.*;
import java.util.StringTokenizer;

public class BJON_2566 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int[] index = {1, 1};

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 9; j++){
                int n = Integer.parseInt(st.nextToken());
                if(n > max){
                    max = n;
                    index[0] = i + 1;
                    index[1] = j + 1;
                }
            }
        }

        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        br.write(String.valueOf(max+"\n"));
        br.write(String.valueOf(index[0]) + " " + String.valueOf(index[1]));
        br.close();
    }
}