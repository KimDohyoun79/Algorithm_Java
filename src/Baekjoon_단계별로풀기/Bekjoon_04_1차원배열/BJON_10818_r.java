package Baekjoon_단계별로풀기.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/27866
//      int max = Integer.MIN_VALUE;
//      int min = Integer.MAX_VALUE;
//      max = Math.max(max, num);
//      min = Math.min(min, num);

import java.util.Scanner;

public class BJON_10818_r {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(min + " " + max);
    }
}