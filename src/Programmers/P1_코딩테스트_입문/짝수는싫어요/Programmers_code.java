package Programmers.P1_코딩테스트_입문.짝수는싫어요;
// https://school.programmers.co.kr/learn/courses/30/lessons/120813


import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_code {
    public static int[] solution(int n) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                arr.add(i);
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10))); // [1, 3, 5, 7, 9]
    }
}
