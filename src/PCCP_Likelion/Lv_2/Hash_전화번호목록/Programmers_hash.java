package PCCP_Likelion.Lv_2.Hash_전화번호목록;
//https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java

/**
 * 1. 배열 오름차순 정렬(어떤 번호가 다른 번호의 접두어인 경우를 확인해야 한다.)
 * 여기서 정수를 기준으로 정렬하는 것이 아닌 문자열을 가지고 정렬하는 것이므로 사전순처럼 정렬이 된다.
 * String[] test = {"3", "111", "11", "22"};
 * Arrays.sort(test);
 * test => {"11", "111", "22", "3"}
 * 2. 정렬이 되어 있는 상태이기 때문에 앞에서부터 앞 번호가 뒷 번호의 접두어 인지 확인한다.
 * 접두어가 맞다면 false를 반환
 * 3. 반복문&조건문을 다 확인했으면 접두어가 있는 경우가 없다는 의미이므로 true를 반환
 */

import java.util.Arrays;

public class Programmers_hash {

    public static boolean solution(String[] phone_book) {
        // 1. phone_book 오름차순 정렬
        Arrays.sort(phone_book);

        // 2. 앞 번호가 뒷 번호의 접두어인지 확인
        for (int i = 0; i < phone_book.length - 1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것을 의미
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123", "456", "789"}));
        System.out.println(solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
