package Baekjoon_단계별로풀기.Bekjoon_03_반복문;
//https://www.acmicpc.net/problem/25314

import java.util.Scanner;

public class BJON_25314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bite = sc.nextInt();

        for(int i = 0; i < bite/4; i++)
            System.out.print("long ");
        System.out.println("int");
    }
}