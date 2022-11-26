package PCCP_Likelion.Lv_2.Greedy_큰수만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/42883

/**
 * 0. 테스트 10번에서 시간초과로 인해 사용.
 * 1. 숫자 앞자리부터 앞 숫자가 다음 숫자보다 작으면 (n < n+1) 앞에 있는 숫자를 지운다.
 * 2. 마지막 자리 비교 시 앞 숫자가 다음 숫자보다 크거나 같으면 (n-1 >= n) 뒤에 있는 숫자를 지운다.
 * 3. k가 0이 될 때까지 1, 2를 반복한다.
 */

public class Programmers_greedy {
    public static String solution(String number, int k) {

        StringBuilder sb = new StringBuilder(number);

        while (k != 0) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if(sb.charAt(i) == '9'){ // 0.
                    continue;
                }
                if (sb.charAt(i) < sb.charAt(i + 1)) { // 1.
                    sb.delete(i, i + 1);
                    k--;
                    break;
                } else if (sb.charAt(i) >= sb.charAt(i + 1) && i == sb.length() - 2) { // 2.
                    sb.delete(i + 1, i + 2);
                    k--;
                    break;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("1924", 2)); // 94
        System.out.println(solution("1231234", 3)); // 3234
        System.out.println(solution("4177252841", 4)); // 775841
        //테스트 12 시간초과
        System.out.println(solution("9998881234", 4)); // 999888
        System.out.println(solution("666666", 3)); //
        System.out.println(solution("87654321", 3)); // 87654
        System.out.println(solution("1000000", 6)); //

    }
}


// 시간초과
//public class Programmers_greedy {
//    public static String solution(String number, int k) {
//
//        StringBuilder sb = new StringBuilder(number);
//
//        while (k != 0) {
//            for (int i = 0; i < sb.length() - 1; i++) {
//                if (sb.charAt(i) < sb.charAt(i + 1)) {
//                    sb.delete(i, i + 1);
//                    k--;
//                    break;
//                }
//            }
//        }
//
//        String answer = String.valueOf(sb);
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solution("1924", 2)); // 94
//        System.out.println(solution("1231234", 3)); // 3234
//        System.out.println(solution("4177252841", 4)); // 775841
//    }
//}
