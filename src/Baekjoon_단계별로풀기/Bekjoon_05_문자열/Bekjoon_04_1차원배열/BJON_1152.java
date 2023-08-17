package Baekjoon_단계별로풀기.Bekjoon_05_문자열.Bekjoon_04_1차원배열;
//https://www.acmicpc.net/problem/1152

// trim() vs strip() 차이 : https://hianna.tistory.com/526
// trim() : '\u0020' 이하 공백들만( 스페이스['\u0020'], 탭['\u0009] )
// strip() : 유니코드의 공백들을 모두 제거

import java.util.Scanner;

public class BJON_1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        int space = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                space++;
        }

        System.out.println(space == 0 ? 0 : space + 1);
    }
}
