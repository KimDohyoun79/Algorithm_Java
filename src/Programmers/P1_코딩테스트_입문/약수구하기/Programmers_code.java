package Programmers.P1_코딩테스트_입문.약수구하기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120897

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_code {
    public static int[] solution(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n%i == 0)
                arr.add(i);
        }

        int[] answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));

    }
}
