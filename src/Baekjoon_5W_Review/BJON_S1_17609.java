package Baekjoon_5W_Review;
//https://www.acmicpc.net/problem/2023

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJON_S1_17609 {
    static int T; // 단어의 수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        // 초기화
        String word = "";
        int result = 0;

        for(int i = 0; i < T; i++) {
            word = br.readLine();

            result = check(word);

            // 다른게 없다면 0으로 넘어온다.
            // 하지만 다른게 발생을 하면 1씩 추가로 증가된다.
            // 그래서 -1을 해준다.
            if (result >= 2)
                System.out.println(result - 1);
            else
                System.out.println(result);
        }
    }

    public static int check(String word) {
        int result = 0;
        int left = 0;
        int right = word.length()-1;

        while(left <= right) {
            // 왼쪽 포인터와 오른쪽 포인터 체크
            // 같으면
            if(word.charAt(left) == word.charAt(right)) {
                left++; // 왼쪽은 증가
                right--; // 오른쪽은 감소
            }
            else { // 다르면
                result = 1; // 위에서 처리 안되고 내려오면 최소 1번은 다르니까

                int l = left + 1; // 임시 왼쪽 포인터
                int r = right; // 임시 오른쪽 포인터

                // 왼쪽을 이동해서 체크 (왼쪽을 1개 지웠다고 생각)
                while(l <= r) {
                    if(word.charAt(l) == word.charAt(r)) {
                        l++;
                        r--;
                    }
                    else {
                        result++; // 다르면 증가
                        break;
                    }
                }

                l = left;
                r = right - 1;

                // 오른쪽을 이동해서 체크 (오른쪽을 1개 지웠다고 생각)
                while(l <= r){
                    if(word.charAt(l) == word.charAt(r)) {
                        l++;
                        r--;
                    }
                    else {
                        result++; // 다르면 증가
                        break;
                    }
                }

                return result; // 왼쪽 or 오른쪽 중 1개만 다르다면 2, 둘 다 다르면 3
            }
        }

        return result; // 다른게 없다면 0
    }
}