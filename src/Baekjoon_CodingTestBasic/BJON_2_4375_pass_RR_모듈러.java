package Baekjoon_CodingTestBasic;
// 문제 : 1
// 기초 문제 : https://code.plus/course/51
// 문제 링크 : https://www.acmicpc.net/problem/4375
// 참고 : 모듈려 연산 https://gliver.tistory.com/5


// 시간초과 주의!

import java.io.*;

class BJON_2_4375_pass_RR_모듈러 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = null;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);

            long i = 1;
            int len = 1;

            // 모듈러 연산
            while (i % num != 0) {
                i = (i * 10 + 1);
                i = i% num;
                len++;
            }
            bw.write(String.valueOf(len) + "\n");
            bw.flush();
        }
        br.close();
        bw.close();

    }
}