package PCCP_Likelion.Lv_2.Stack_Queue_주식가격;
// https://school.programmers.co.kr/learn/courses/30/lessons/42584


import java.util.Arrays;

public class Programmers_queue {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int cnt = 0;
        for (int i = 0; i < prices.length; i++) {
            cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                cnt = j - i;
                if (prices[i] > prices[j])
                    break;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }
}

