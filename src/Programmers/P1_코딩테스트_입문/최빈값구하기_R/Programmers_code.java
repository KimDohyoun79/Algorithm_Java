package Programmers.P1_코딩테스트_입문.최빈값구하기_R;
// https://school.programmers.co.kr/learn/courses/30/lessons/120812


import java.util.HashMap;

public class Programmers_code {
    public static int solution(int[] array) {
        HashMap<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            arrMap.put(array[i], arrMap.getOrDefault(array[i], 1)+1);
        }

        System.out.println(arrMap);
        int maxKey = 0;
        int maxValue = -1;
        for (int key: arrMap.keySet()) {
            if(maxValue < arrMap.get(key)) {
                System.out.println(key);
                maxValue = arrMap.get(key);
                maxKey = key;
            }
        }

        for (int key: arrMap.keySet()) {
            if(maxValue == arrMap.get(key) && key!=maxKey) {
                return -1;
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4})); //3
    }
}
