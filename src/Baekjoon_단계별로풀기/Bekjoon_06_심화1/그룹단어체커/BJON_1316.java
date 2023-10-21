package Baekjoon_단계별로풀기.Bekjoon_06_심화1.그룹단어체커;
//https://www.acmicpc.net/problem/1316

import java.io.*;

public class BJON_1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;

        for(int i = 0; i < n; i ++){
            String s = bf.readLine();
            boolean[] arr = new boolean[26];
            int j = 0;
            for(; j < s.length(); j++){
                char c = s.charAt(j);
                if(!arr[c - 'a']){
                    arr[c - 'a'] = true;
                    while(j < s.length() && s.charAt(j) == c)
                        j++;
                    j--;
                }
                else
                    break;
            }
            if(j == s.length())
                count++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}