package Baekjoon_CodingTestBasic.B1_Math;
// 문제 : 나머지
// 기초 문제 : https://code.plus/course/51
// 문제 링크 : https://www.acmicpc.net/problem/10430
// 참고 : https://st-lab.tistory.com/19
import java.util.Scanner;

class BJON_1_10430_pass_R_모듈러 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }

}