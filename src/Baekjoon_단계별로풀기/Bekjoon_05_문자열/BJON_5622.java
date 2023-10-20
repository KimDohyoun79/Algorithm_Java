package Baekjoon_단계별로풀기.Bekjoon_05_문자열;
//https://www.acmicpc.net/problem/5622

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJON_5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split("");

        int result = 0;
        String abc = "abc";
        for(int i = 0; i < s.length; i++){
            if("ABC".contains(s[i]))
                result += 3;
            else if("DEF".contains(s[i]))
                result += 4;
            else if("GHI".contains(s[i]))
                result += 5;
            else if("JKL".contains(s[i]))
                result += 6;
            else if("MNO".contains(s[i]))
                result += 7;
            else if("PQRS".contains(s[i]))
                result += 8;
            else if("TUV".contains(s[i]))
                result += 9;
            else if("WXYZ".contains(s[i]))
                result += 10;

        }

        System.out.println(result);
    }
}