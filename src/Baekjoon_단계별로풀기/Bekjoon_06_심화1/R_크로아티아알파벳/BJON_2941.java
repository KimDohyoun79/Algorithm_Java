package Baekjoon_단계별로풀기.Bekjoon_06_심화1.R_크로아티아알파벳;
//https://www.acmicpc.net/problem/2941

import java.io.*;

public class BJON_2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(str.contains(arr[i])){
                str = str.replaceFirst(arr[i], "1");
                count++;
                i--;
            }
        }

        for(int i = 0; i < str.length(); i++){
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}