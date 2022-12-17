package Programmers.P0_코딩테스트_입문.배열회전시키기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120844


import java.util.*;

public class Programmers_code {

    public static int[] solution(int[] numbers, String direction) {

        Deque<Integer> dec = new ArrayDeque<>();

        for ( int num: numbers) {
            dec.add(num);
        }

        if (direction.equals("right")) {
            dec.addFirst(dec.getLast());
            dec.pollLast();
        }
        else{
            dec.addLast(dec.getFirst());
            dec.pollFirst();
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = dec.pollFirst();
        }

        return numbers;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right"))); // [3, 1, 2]
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"))); // [455, 6, 4, -1, 45, 6, 4]
    }
}
