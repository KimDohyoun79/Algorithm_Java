package Baekjoon_단계별로풀기.Bekjoon_09_약수배수소수.배수와약수;
//https://www.acmicpc.net/problem/5086

import java.io.*;
import java.util.StringTokenizer;

public class BJON_5086 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0)
                break;

            if(a % b == 0)
                bw.write("multiple\n");
            else if (b % a == 0)
                bw.write("factor\n");
            else
                bw.write("neither\n");

        }

        bw.close();
    }
}