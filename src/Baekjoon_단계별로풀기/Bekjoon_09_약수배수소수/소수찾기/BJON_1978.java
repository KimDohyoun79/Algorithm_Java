package Baekjoon_단계별로풀기.Bekjoon_09_약수배수소수.소수찾기;
//https://www.acmicpc.net/problem/1978

import java.io.*;
import java.util.StringTokenizer;

public class BJON_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int re = 0;
        while(n-- > 0){
            int num = Integer.parseInt(st.nextToken());
            re += decimal(num) ? 1 : 0;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(re));

        bw.close();
    }

    private static boolean decimal(int num){
        if(num == 1)
            return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
}