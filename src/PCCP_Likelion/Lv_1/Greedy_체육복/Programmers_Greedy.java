package PCCP_Likelion.Lv_1.Greedy_체육복;
//https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.Arrays;

public class Programmers_Greedy {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 있는 학생이 도난 당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 그냥 학생이 도난 당한 겨우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5})); // 5
//        System.out.println(solution(5, new int[]{2, 4}, new int[]{3})); //4
//        System.out.println(solution(3, new int[]{3}, new int[]{1})); //2
//        System.out.println(solution(4, new int[]{2}, new int[]{4})); //3

        //여벌 체육복이 있는 학생도 도난당할 수 있습니다.
        System.out.println(solution(4, new int[]{2,3}, new int[]{3,4})); //3

        //정렬이 안되어 있는 경우
        System.out.println(solution(5, new int[]{4,2}, new int[]{3,5})); //5
    }
}


