package Programmers.P1_코딩테스트_입문.피자나눠먹기2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120812


public class Programmers_code {

    public static int solution(int n) {

        int i = 1;
        int pizza = 6;
        while (pizza % n != 0) {
            i++;
            pizza = 6 * i;
        }
        return i;
    }


    public static void main(String[] args) {

        System.out.println(solution(6)); // 1
        System.out.println(solution(10)); // 5
        System.out.println(solution(4)); // 2
    }
}
