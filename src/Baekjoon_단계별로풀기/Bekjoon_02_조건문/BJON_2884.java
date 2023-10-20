package Baekjoon_단계별로풀기.Bekjoon_02_조건문;
//https://www.acmicpc.net/problem/2884

import java.util.Scanner;

public class BJON_2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt() - 45;

        if (m < 0) {
            h--;
            m = 60 + m;
        }
        if (h < 0)
            h = 23;

        System.out.println(h + " " + m);
    }
}
