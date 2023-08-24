package LikeLion_Back2_Class.PCCP_Likelion.Lv_3.Hash_베스트앨범_ummm;
//https://school.programmers.co.kr/learn/courses/30/lessons/42579

/**
 * 1. 가장 많이 재생된 장르순으로 수록 (HashMap)
 * 2. 장르 내에서 가장 많이 재생된 노래 먼저 수록 (2개만)
 * 3. 장르 내에서 재생 횟수가 같은 노래가 있으면 고유 번호가 낮은 노래를 먼저 수록
 *
 */

public class Programmers_hash {

    public static int[] solution(String[] genres, int[] plays) {

        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
                solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
    }
}
