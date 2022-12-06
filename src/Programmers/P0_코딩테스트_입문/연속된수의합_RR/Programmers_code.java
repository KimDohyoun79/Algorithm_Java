package Programmers.P0_코딩테스트_입문.연속된수의합_RR;
// https://school.programmers.co.kr/learn/courses/30/lessons/120923

//      1. total / num = 중간 값.
//      2. total % num != 0 일때는 num / 2 - 1만큼 빼준 자리에서 시작
//      3. total % num == 0 일때는 num / 2만큼 빼준 자리에서 시작

import java.util.Arrays;

public class Programmers_code {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total / num) - (total % num == 0 ? num/2 : num/2 - 1);
        for (int i = 0; i < num; i++) {
            answer[i] = start++;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(3, 12))); // 3 4 5
        System.out.println(Arrays.toString(solution(5, 15))); // 1 2 3 4 5
        System.out.println(Arrays.toString(solution(4, 14))); // 2 3 4 5
        System.out.println(Arrays.toString(solution(5, 5))); // -1 0 1 2 3

        System.out.println(Arrays.toString(solution(4, 10))); // 1 2 3 4
        System.out.println(Arrays.toString(solution(4, 50))); // 11 12 13 14
        System.out.println(Arrays.toString(solution(3, 0))); // -1 0 1
        System.out.println(Arrays.toString(solution(3, -6))); // -3 -2 -1
        System.out.println(Arrays.toString(solution(5, 20))); // 2 3 4 5 6
        System.out.println(Arrays.toString(solution(5, 25))); // 3 4 5 6 7

    }
}
