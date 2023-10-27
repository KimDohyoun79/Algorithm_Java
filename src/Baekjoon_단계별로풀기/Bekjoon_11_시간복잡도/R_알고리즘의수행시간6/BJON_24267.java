package Baekjoon_단계별로풀기.Bekjoon_11_시간복잡도.R_알고리즘의수행시간6;
//https://www.acmicpc.net/problem/24313
//https://velog.io/@bassy3260/%EB%B0%B1%EC%A4%80-2426224267%EB%B2%88-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-16-JAVA

import java.util.*;

public class BJON_24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println(3);
    }
}