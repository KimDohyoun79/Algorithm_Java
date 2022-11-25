package PCCP_Likelion.Lv_1.Sort_제일작은수제거하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/12935?language=java

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_sort {
    public static int[] solution(int[] arr) {

        // 1. 배열에 데이터가 하나만 있으면 -1로 반환
        int[] answer;
        if (arr.length -1 == 0)
            return answer = new int[]{-1};

        // 2. 가장 작은 수 구하기
        int min = Integer.MAX_VALUE;

        for (int num: arr) {
            min = Math.min(min, num);
        }

        // 3. 가장 작은 수를 제외하고 연결리스트에 추가
        ArrayList<Integer> list = new ArrayList<>();

        for (int num: arr) {
            if(min == num)
                continue;
            else
                list.add(num);
        }

        // 4. 반환할 배열에 연결리스트 길이 만큼 초기화 해주고 저장하여 반환
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{4,3,2,1}))); // 4, 3, 2
        System.out.println(Arrays.toString(solution(new int[]{10}))); // -1
    }
}


