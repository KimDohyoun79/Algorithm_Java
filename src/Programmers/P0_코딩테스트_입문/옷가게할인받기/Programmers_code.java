package Programmers.P0_코딩테스트_입문.옷가게할인받기;
// https://school.programmers.co.kr/learn/courses/30/lessons/120818


public class Programmers_code {
    public static int solution(int price) {

        int discount = 0;
        if (100_000 <= price && price < 300_000)
            discount = 5;
        else if (300_000 <= price && price < 500_000)
            discount = 10;
        else if (500_000 <= price)
            discount = 20;
        return price*100 - (price * discount / 100);
    }


    public static void main(String[] args) {
        System.out.println(solution(100_000)); // 95,000
        System.out.println(solution(150_000)); // 142,500
        System.out.println(solution(580_000)); // 464,000
        System.out.println(solution(1_000_000)); // 464,000
    }
}
