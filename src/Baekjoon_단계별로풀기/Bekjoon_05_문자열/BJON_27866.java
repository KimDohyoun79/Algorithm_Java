package Baekjoon_단계별로풀기.Bekjoon_05_문자열;
//https://www.acmicpc.net/problem/27866
//str.charAt()

import java.util.Scanner;

public class BJON_27866 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(str.charAt(i - 1));

    }
}