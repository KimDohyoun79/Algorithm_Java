package Baekjoon_6W_BinarySearch;
//https://www.acmicpc.net/problem/1920

import java.util.Arrays;
import java.util.Scanner;
// 최대로 가질 수 있는 '최소 거리' 출력
class Main_2110 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 집의 개수    2<= n <= 200_000
        int c = sc.nextInt();   // 공유기 개수   2<= c <= n

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println((Arrays.toString(arr)));
    }

}