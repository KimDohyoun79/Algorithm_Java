package Baekjoon_CodingTestBasic;
// 문제 : 약수
// 기초 문제 : https://code.plus/course/51
// 문제 링크 : https://www.acmicpc.net/problem/1037
// 참고 :

import java.util.Scanner;

class BJON_3_1037_pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            if (num > max)
                max = num;
            if (num < min)
                min = num;

        }
        System.out.println(max * min);

    }

}