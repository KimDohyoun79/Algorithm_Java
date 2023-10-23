package Baekjoon_단계별로풀기.Bekjoon_07_2차원배열.색종이;
//https://www.acmicpc.net/problem/2563

import java.io.*;

public class BJON_2563 {

    private static int[][] arr = new int[101][101];
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            String[] s = br.readLine().split(" ");
            checking(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }

    private static void checking(int x, int y){
        for(int i = x; (i < x + 10) && (i < 101); i++){
            for(int j = y; (j < y + 10) && (j < 101); j++){
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                    count++;
                }
            }
        }
    }
}