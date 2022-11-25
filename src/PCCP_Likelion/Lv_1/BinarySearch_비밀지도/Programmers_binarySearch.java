package PCCP_Likelion.Lv_1.BinarySearch_비밀지도;
//https://school.programmers.co.kr/learn/courses/30/lessons/12982


import java.util.Arrays;

public class Programmers_binarySearch {

    public static String bi(int num, int n) {

        String s = "";
        while (num > 0) {
            s = num % 2 + s;
            num = num / 2;
        }
        return "0".repeat(n - s.length()) + s;
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = bi(arr1[i] | arr2[i], n)
                    .replaceAll("1", "#")
                    .replaceAll("0", " ");
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }
}
