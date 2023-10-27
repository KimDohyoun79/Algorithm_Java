package Baekjoon_단계별로풀기.Bekjoon_05_문자열;
//https://www.acmicpc.net/problem/2675

// 참고 : https://st-lab.tistory.com/63

import java.util.Scanner;

public class BJON_2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}