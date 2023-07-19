package Baekjoon_단계별로풀기.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/3052

import java.util.Scanner;

public class BJON_3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n[] = new int[42];
        int result = 0;

        for (int i = 0; i < 10; i++) {
            n[sc.nextInt() % 42]++;
        }

        for (int i = 0; i < n.length; i++) {
            if(n[i]>0)
                result++;
        }

        System.out.println(result);
    }
}