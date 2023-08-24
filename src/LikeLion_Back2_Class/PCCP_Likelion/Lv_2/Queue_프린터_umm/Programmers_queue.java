package LikeLion_Back2_Class.PCCP_Likelion.Lv_2.Queue_프린터_umm;
//https://school.programmers.co.kr/learn/courses/30/lessons/42587


import java.util.LinkedList;
import java.util.Queue;

public class Programmers_queue {

    public static int solution(int[] priorities, int location) {

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            int[] num = {priorities[i], i == location ? 1 : 0};
            q.offer(num);
        }

        while(!q.isEmpty()){
            int[] tmp = q.poll();

        }

        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
    }
}

