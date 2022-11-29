package Programmers.P1_코딩테스트_입문.숫자찾기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120904


public class Programmers_code {

    public static int solution(int num, int k) {

        String s = String.valueOf(num);
        String sk = String.valueOf(k);

        return s.indexOf(sk)<0? -1:s.indexOf(sk)+1;
    }


    public static int solution1(int num, int k) {

        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == k)
                return i + 1;

        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(solution(29183, 1)); // 3
        System.out.println(solution(232443, 4)); // 4
        System.out.println(solution(123456, 7)); // -1
    }
}
