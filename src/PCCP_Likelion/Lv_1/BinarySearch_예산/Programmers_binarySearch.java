package PCCP_Likelion.Lv_1.BinarySearch_예산;
//https://school.programmers.co.kr/learn/courses/30/lessons/12982


import java.util.Arrays;

public class Programmers_binarySearch {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(sum<=budget){
                sum += d[i];
                answer++;
            }
        }

        if (sum <= budget)
            return answer;
        else {
            return answer - 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9)); // 3
        System.out.println(solution(new int[]{2, 2, 3, 3}, 10)); // 4
        System.out.println(solution(new int[]{1}, 10)); // 1
    }
}


