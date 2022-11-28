package Programmers.P1_코딩테스트_입문.배열의평균값;
// https://school.programmers.co.kr/learn/courses/30/lessons/120585


import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_code {
    public static double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers){
            answer += num;
        }
        return answer/numbers.length;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
