package Baekjoon_단계별로풀기.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/10810
// 배열 초기화 : Arrays.fill(arr, sc.nextInt() - 1, sc.nextInt(), sc.nextInt());

import java.util.Arrays;
import java.util.Scanner;

public class R_BJON_10810 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        while (M-- > 0) {
            Arrays.fill(arr, sc.nextInt() - 1, sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i != N - 1 ? " " : ""));
        }
    }
}