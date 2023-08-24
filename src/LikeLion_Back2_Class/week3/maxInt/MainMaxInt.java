package LikeLion_Back2_Class.week3.maxInt;

import java.util.Scanner;

public class MainMaxInt {
    // 최대값과 인덱스 찾기
    public static int[] findMax(int[] arr) {
        int maxIdx = 0;
        int maxNum = arr[maxIdx];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxIdx = i;
                maxNum = arr[maxIdx];
            }
        }
        return new int[]{maxIdx, maxNum};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[9];
        int[] numbers = {3, 2, 1};

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            numbers[i] = n;
        }

    }
}
