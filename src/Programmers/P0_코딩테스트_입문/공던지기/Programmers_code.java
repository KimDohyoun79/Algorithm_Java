package Programmers.P0_코딩테스트_입문.공던지기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120843


public class Programmers_code {
    public static int solution(int[] numbers, int k) {

        int index = 0;
        while (--k > 0) {

            if (index == numbers.length - 2)
                index = 0;
            else if (index == numbers.length-1) {
                index = 1;
            }
            else
                index +=2;
        }

        return numbers[index];
    }


    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 2, 3, 4}, 2)); // 3
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5)); // 3
        System.out.println(solution(new int[]{1, 2, 3}, 3)); // 2
    }
}
