package Baekjoon_단계별로풀기.Bekjoon_05_문자열.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/11720

import java.util.Scanner;

// 문자 => 정수 형변환
// 문자 연산시 정수로 형변환 (문자 연산시 큰 자료형으로 형변환이 된다.)
// 아스키코드값으로 변환 : word - '0'
// 함수 사용 : Character.getNumericValue(str.charAt(i));
//참고 : https://dlee0129.tistory.com/230

public class BJON_11720_rr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int hap = 0;

        for (int i = 0; i < str.length(); i++) {
            hap += Character.getNumericValue(str.charAt(i));
        }

        System.out.println(hap);
    }
}