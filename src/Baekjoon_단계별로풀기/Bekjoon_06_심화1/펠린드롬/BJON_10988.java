package Baekjoon_단계별로풀기.Bekjoon_06_심화1.펠린드롬;
//https://www.acmicpc.net/problem/10988

import java.io.*;

public class BJON_10988 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        String result = "1";
        int l = 0;
        int r = str.length() - 1;
        while(l < r){
            if(str.charAt(l++) != str.charAt(r--)){
                result = "0";
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.flush();
        bw.close();

    }
}