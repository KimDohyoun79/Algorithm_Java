package Baekjoon_단계별로풀기.Bekjoon_02_조건문;
//https://www.acmicpc.net/problem/2884

import java.util.Scanner;

public class BJON_2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt() + m;

        h += t / 60;
        m = t % 60;

        System.out.println((h > 23 ? h % 24 : h) + " " + m);
    }
}