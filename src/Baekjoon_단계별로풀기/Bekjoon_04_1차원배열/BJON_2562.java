package Baekjoon_단계별로풀기.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/2562

import java.util.Scanner;

public class BJON_2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n[] = new int[9];
        int max = -1;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
            if (max < n[i]) {
                max = n[i];
                maxIndex = i;
            }
        }

        System.out.println(n[maxIndex] + "\n" + (maxIndex + 1));
    }
}