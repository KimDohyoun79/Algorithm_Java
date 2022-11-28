package Programmers.P1_코딩테스트_입문.분수의덧셈_R;
// https://school.programmers.co.kr/learn/courses/30/lessons/120808


import java.util.Arrays;

public class Programmers_code {
    public static int[] solution(int denum1, int num1, int denum2, int num2) {

        int n = num1 * num2;
        int denum = denum1 * num2 + denum2 * num1;


        for (int i = n; i >= 2; i--) {
            if (n % i == 0 && denum % i == 0) {
                n /= i;
                denum /= i;
            }
        }

        int[] answer = {denum, n};
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4))); // [5, 4]
        System.out.println(Arrays.toString(solution(9, 2, 1, 3))); // [29, 6]
    }
}
