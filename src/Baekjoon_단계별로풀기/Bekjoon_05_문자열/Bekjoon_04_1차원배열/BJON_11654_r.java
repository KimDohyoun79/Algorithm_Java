package Baekjoon_단계별로풀기.Bekjoon_05_문자열.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/11654

// 문자 입력받기
// 바로 char로 받기 : char word = sc.next().charAt(0);
// int 로 받기
// System.in.read() 사용

// 참고 : https://st-lab.tistory.com/59

import java.io.IOException;
import java.util.Scanner;

public class BJON_11654_r {

    public static void main(String[] args) throws IOException {


//        #1 204ms
//        Scanner sc = new Scanner(System.in);
//        char word = sc.next().charAt(0);
//        System.out.println((int)word);

//        #2 204ms
//        Scanner sc = new Scanner(System.in);
//        int word = sc.next().charAt(0);
//        System.out.println(word);

//        #3 124ms
        int word = System.in.read();
        System.out.println(word);
    }
}
