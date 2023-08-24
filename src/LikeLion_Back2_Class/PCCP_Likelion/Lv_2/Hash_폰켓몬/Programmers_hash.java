package LikeLion_Back2_Class.PCCP_Likelion.Lv_2.Hash_폰켓몬;
//https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java

import java.util.HashSet;

/**
 * 1. 가질 수 있는 폰켓몬 수 구하기 (num.length)
 * 2. 폰켓몬 종류 구하기 (set 사용)
 * 3. 폰켓몬 수/2 > 폰켓몬 종류 ? 폰켓몬 종류 : 폰켓몬 수/2
 */

public class Programmers_hash {
    public static int solution(int[] nums) {

        HashSet set = new HashSet();

        // 2.
        for (int num : nums) {
            set.add(num);
        }

        // 1. 3.
        return nums.length / 2 > set.size() ? set.size() : nums.length / 2;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3})); // 2
        System.out.println(solution(new int[]{3,3,3,2,2,4})); // 3
        System.out.println(solution(new int[]{3,3,3,2,2,2})); // 2
    }
}
