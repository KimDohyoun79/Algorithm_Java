package Programmers.P0_코딩테스트_입문.문자열곱하기;
// https://school.programmers.co.kr/learn/courses/30/lessons/181940

public class Solution {

    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }


    public static void main(String[] args) {

        System.out.println(solution("string", 3)); // "stringstringstring"
    }
}
