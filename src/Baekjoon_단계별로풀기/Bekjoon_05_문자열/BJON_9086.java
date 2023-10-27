package Baekjoon_단계별로풀기.Bekjoon_05_문자열;
//https://www.acmicpc.net/problem/9086

// next***() : 스페이스&개행기준
// 문자열 : next() : 스페이스&개행기준
// 문자열 : nextLine() : 개행기준

// 문자 + 문자 = 정수로 출력
// 문자 연산 시 정수로 형변환된다.
// 문자열 + 문자열 = 문자열

import java.util.Scanner;

public class BJON_9086 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }
    }
}