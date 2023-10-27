package Baekjoon_단계별로풀기.Bekjoon_10_직사각형과삼각형.R_네번째점;
//https://www.acmicpc.net/problem/3009

import java.io.*;
import java.util.*;

public class BJON_3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];

        // 입력 데이터 저장
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int x = arr[0][0] == arr[1][0] ? arr[2][0] : (arr[1][0] == arr[2][0] ? arr[0][0] : arr[1][0]);
        int y = arr[0][1] == arr[1][1] ? arr[2][1] : (arr[1][1] == arr[2][1] ? arr[0][1] : arr[1][1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(x + " " +y);
        bw.close();
    }
}