package Programmers.P1_코딩테스트_입문.피자나눠먹기3;
// https://school.programmers.co.kr/learn/courses/30/lessons/120812


public class Programmers_code {
    public static int solution(int slice, int n) {

        int i = 1;
        int pizza = slice;
        while (pizza < n) {
            i++;
            pizza = slice * i;
        }
        return i;
    }


    public static void main(String[] args) {

        System.out.println(solution(7, 10)); // 2
        System.out.println(solution(4, 12)); // 3
        System.out.println(solution(12, 40)); // 3
    }
}
