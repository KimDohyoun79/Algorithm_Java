package Programmers.P1_코딩테스트_입문.배열2차원으로만들기_R;
// https://school.programmers.co.kr/learn/courses/30/lessons/120585


import java.util.Arrays;

public class Programmers_code {

    public static int[][] solution1(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        for (int i = 0; i < num_list.length;i++){
            answer[i/n][i%n] = num_list[i];
        }
        return answer;
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int k = 0;
        for (int i = 0; i < num_list.length/n;i++){
            for(int j = 0; j < n;j++){
                answer[i][j] = num_list[k++];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2)));
    }
}
