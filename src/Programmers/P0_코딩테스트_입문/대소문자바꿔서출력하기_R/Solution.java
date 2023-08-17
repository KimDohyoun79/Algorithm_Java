package Programmers.P0_코딩테스트_입문.대소문자바꿔서출력하기_R;
// https://school.programmers.co.kr/learn/courses/30/lessons/181949

/*
    대소문자 함수
    Character.isLowerCase(c)
    Character.toUpperCase(c)
    Character.toLowerCase(c)
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(Character.isLowerCase(c))
                System.out.print(Character.toUpperCase(c));
            else
                System.out.print(Character.toLowerCase(c));
        }
    }
}

