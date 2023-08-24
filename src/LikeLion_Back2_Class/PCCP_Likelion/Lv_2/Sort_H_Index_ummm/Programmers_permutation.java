package LikeLion_Back2_Class.PCCP_Likelion.Lv_2.Sort_H_Index_ummm;
//https://school.programmers.co.kr/learn/courses/30/lessons/42747


import java.util.Arrays;

public class Programmers_permutation {

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));



        return citations[citations.length/2];
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));

    }
}