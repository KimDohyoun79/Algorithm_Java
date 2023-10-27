package Baekjoon_단계별로풀기.Bekjoon_06_심화1.R_단어공부;
//https://www.acmicpc.net/problem/1157

import java.io.*;

public class BJON_1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        
        String s = bf.readLine().toUpperCase();

        // 알파벳 개수를 배열에 저장
        for(int i = 0; i < s.length(); i++)
            alpha[s.charAt(i) - 'A']++;
        
        // 가장 많이 사용된 알파벳 찾기
        int max = -1;
        int maxIndex = 0;
        char c = '?';
        for(int i = 0; i < 26; i++){
            if(alpha[i] > max) {
                max = alpha[i];
                maxIndex = i;
                c = (char)(i + 'A');
            }
        }
        
        // 가장 많이 사용된 알파벳 중복 확인
        for(int i = 0; i < 26; i++){
            if(alpha[i] == max && i != maxIndex) {
                c = '?';
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(c);
        bw.close();

    }
}