package Baekjoon_단계별로풀기.Bekjoon_08_일반수학.분수찾기;
//https://www.acmicpc.net/problem/1193

import java.io.*;

public class BJON_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());

        int line = 0;
        int th = 0;
        while(th < x){
            line++;
            th += line;
        }
        th -= line;

        int f = 1, e = 1;
        if(line % 2 ==0){
            f = 1;
            e = line;
            while(++th != x){
                f++;
                e--;
            }
        }
        else{
            f = line;
            e = 1;
            while(++th != x){
                f--;
                e++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(f) + "/" + String.valueOf(e));
        bw.close();
    }
}